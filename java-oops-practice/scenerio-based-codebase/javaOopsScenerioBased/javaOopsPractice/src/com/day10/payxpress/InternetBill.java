package com.day10.payxpress;

public class InternetBill extends Bill {

    public InternetBill(double amount, String dueDate) {
        super("Internet", amount, dueDate);
    }

    @Override
    public void sendReminder() {
        System.out.println("Internet Bill Reminder: Pay before " + dueDate);
    }
}