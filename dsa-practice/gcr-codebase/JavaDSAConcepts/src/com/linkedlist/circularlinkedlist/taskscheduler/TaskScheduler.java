package com.linkedlist.circularlinkedlist.taskscheduler;

public class TaskScheduler {

    private TaskNode head;
    private TaskNode current;

    // Add at beginning
    public void addAtBeginning(int id, String name, int priority, String date) {
        TaskNode node = new TaskNode(id, name, priority, date);

        if (head == null) {
            head = current = node;
            node.next = head;
            return;
        }

        TaskNode temp = head;
        while (temp.next != head)
            temp = temp.next;

        node.next = head;
        temp.next = node;
        head = node;
    }

    // Add at end
    public void addAtEnd(int id, String name, int priority, String date) {
        TaskNode node = new TaskNode(id, name, priority, date);

        if (head == null) {
            head = current = node;
            node.next = head;
            return;
        }

        TaskNode temp = head;
        while (temp.next != head)
            temp = temp.next;

        temp.next = node;
        node.next = head;
    }

    // Add at specific position (1-based)
    public void addAtPosition(int pos, int id, String name, int priority, String date) {
        if (pos <= 1) {
            addAtBeginning(id, name, priority, date);
            return;
        }

        TaskNode temp = head;
        for (int i = 1; i < pos - 1 && temp.next != head; i++)
            temp = temp.next;

        TaskNode node = new TaskNode(id, name, priority, date);
        node.next = temp.next;
        temp.next = node;
    }

    // Remove task by Task ID
    public void removeById(int id) {
        if (head == null) return;

        TaskNode temp = head, prev = null;

        do {
            if (temp.taskId == id) {
                if (temp == head) {
                    TaskNode last = head;
                    while (last.next != head)
                        last = last.next;

                    head = head.next;
                    last.next = head;
                } else {
                    prev.next = temp.next;
                }
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);

        System.out.println("Task not found");
    }

    // View current task and move to next
    public void viewNextTask() {
        if (current == null) return;

        displayTask(current);
        current = current.next;
    }

    // Display all tasks
    public void displayAll() {
        if (head == null) return;

        TaskNode temp = head;
        do {
            displayTask(temp);
            temp = temp.next;
        } while (temp != head);
    }

    // Search by Priority
    public void searchByPriority(int priority) {
        if (head == null) return;

        TaskNode temp = head;
        do {
            if (temp.priority == priority)
                displayTask(temp);
            temp = temp.next;
        } while (temp != head);
    }

    private void displayTask(TaskNode t) {
        System.out.println(
            "ID: " + t.taskId +
            ", Name: " + t.taskName +
            ", Priority: " + t.priority +
            ", Due: " + t.dueDate
        );
    }
}
