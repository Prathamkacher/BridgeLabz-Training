package com.multithreading.threadmonitoring;

class TaskRunner extends Thread {

    public TaskRunner(String name) {
        super(name);
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(getName() + " working...");
            }

            Thread.sleep(2000);

            System.out.println(getName() + " finishing work...");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
