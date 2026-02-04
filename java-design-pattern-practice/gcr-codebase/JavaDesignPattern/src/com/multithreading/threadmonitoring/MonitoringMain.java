package com.multithreading.threadmonitoring;

public class MonitoringMain {

    public static void main(String[] args) throws InterruptedException {

        TaskRunner t1 = new TaskRunner("Task-1");
        TaskRunner t2 = new TaskRunner("Task-2");

        StateMonitor monitor = new StateMonitor(t1, t2);

        System.out.println("Initial State: " + t1.getName() + " → " + t1.getState());

        monitor.start();   // start monitoring first
        Thread.sleep(200); // allow monitor to capture NEW state

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        monitor.join();

        System.out.println("\nAll threads completed");
    }
}
