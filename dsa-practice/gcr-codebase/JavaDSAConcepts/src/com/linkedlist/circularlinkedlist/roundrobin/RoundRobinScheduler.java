package com.linkedlist.circularlinkedlist.roundrobin;

public class RoundRobinScheduler {

    private ProcessNode head;
    private int timeQuantum;

    RoundRobinScheduler(int timeQuantum) {
        this.timeQuantum = timeQuantum;
    }

    // Add process at end
    public void addProcess(int pid, int burst, int priority) {
        ProcessNode node = new ProcessNode(pid, burst, priority);

        if (head == null) {
            head = node;
            node.next = head;
            return;
        }

        ProcessNode temp = head;
        while (temp.next != head)
            temp = temp.next;

        temp.next = node;
        node.next = head;
    }

    // Remove process by PID
    private void removeProcess(ProcessNode prev, ProcessNode curr) {
        if (curr == head && curr.next == head) {
            head = null;
            return;
        }

        if (curr == head) {
            ProcessNode last = head;
            while (last.next != head)
                last = last.next;
            head = head.next;
            last.next = head;
        } else {
            prev.next = curr.next;
        }
    }

    // Simulate Round Robin Scheduling
    public void simulate() {
        if (head == null) return;

        ProcessNode curr = head, prev = null;
        int time = 0;
        int completed = 0;
        int totalWT = 0, totalTAT = 0;

        while (head != null) {

            displayQueue();

            if (curr.remainingTime > timeQuantum) {
                time += timeQuantum;
                curr.remainingTime -= timeQuantum;
            } else {
                time += curr.remainingTime;
                curr.remainingTime = 0;

                curr.turnaroundTime = time;
                curr.waitingTime = curr.turnaroundTime - curr.burstTime;

                totalWT += curr.waitingTime;
                totalTAT += curr.turnaroundTime;
                completed++;

                removeProcess(prev, curr);
            }

            prev = curr;
            curr = curr.next;
        }

        System.out.println("\nAverage Waiting Time: " + (double) totalWT / completed);
        System.out.println("Average Turnaround Time: " + (double) totalTAT / completed);
    }

    // Display circular queue
    private void displayQueue() {
        if (head == null) return;

        ProcessNode temp = head;
        System.out.print("Queue: ");
        do {
            System.out.print("P" + temp.pid + "(" + temp.remainingTime + ") ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }
}
