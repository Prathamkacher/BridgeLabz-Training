package com.linkedlist.circularlinkedlist.taskscheduler;

public class TaskSchedulerMain {

    public static void main(String[] args) {

        TaskScheduler scheduler = new TaskScheduler();

        scheduler.addAtBeginning(1, "Design", 1, "10-10-2026");
        scheduler.addAtEnd(2, "Coding", 2, "12-10-2026");
        scheduler.addAtPosition(2, 3, "Testing", 1, "11-10-2026");

        System.out.println("All Tasks:");
        scheduler.displayAll();

        System.out.println("\nCurrent Task Rotation:");
        scheduler.viewNextTask();
        scheduler.viewNextTask();

        System.out.println("\nSearch by Priority 1:");
        scheduler.searchByPriority(1);

        scheduler.removeById(2);

        System.out.println("\nAfter Removal:");
        scheduler.displayAll();
    }
}
