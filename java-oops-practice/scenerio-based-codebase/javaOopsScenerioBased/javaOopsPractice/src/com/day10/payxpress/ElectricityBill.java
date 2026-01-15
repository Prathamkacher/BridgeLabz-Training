package com.day10.payxpress;

public class ElectricityBill extends Bill {

    public ElectricityBill(double amount, String dueDate) {
        super("Electricity", amount, dueDate);
    }

    @Override
    public void sendReminder() {
        System.out.println("Electricity Bill Reminder: Due on " + dueDate);
    }
}
