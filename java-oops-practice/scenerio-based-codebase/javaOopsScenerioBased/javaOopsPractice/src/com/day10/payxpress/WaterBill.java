package com.day10.payxpress;

public class WaterBill extends Bill {

    public WaterBill(double amount, String dueDate) {
        super("Water", amount, dueDate);
    }

    @Override
    public void sendReminder() {
        System.out.println("Water Bill Reminder: Pay before " + dueDate);
    }
}
