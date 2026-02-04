package com.multithreading.printjobscheduler;

public class SchedulerMain {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Starting print jobs...\n");

        long startTime = System.currentTimeMillis();

        Thread j1 = new Thread(new PrintJob("Job1", 10, 5));
        Thread j2 = new Thread(new PrintJob("Job2", 5, 8));
        Thread j3 = new Thread(new PrintJob("Job3", 15, 3));
        Thread j4 = new Thread(new PrintJob("Job4", 8, 6));
        Thread j5 = new Thread(new PrintJob("Job5", 12, 7));

        j1.setPriority(5);
        j2.setPriority(8);
        j3.setPriority(3);
        j4.setPriority(6);
        j5.setPriority(7);

        j1.start();
        j2.start();
        j3.start();
        j4.start();
        j5.start();

        j1.join();
        j2.join();
        j3.join();
        j4.join();
        j5.join();

        long endTime = System.currentTimeMillis();

        System.out.println("\nAll jobs completed in " + (endTime - startTime) + "ms");
    }
}
