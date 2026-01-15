package com.day10.payxpress;

abstract class Bill implements IPayable {

    protected String type;
    protected double amount;
    protected String dueDate;

    private boolean isPaid;          // cannot be modified directly
    private String paymentDetails = "Internal Payment Logs"; // internal only

    public Bill(String type, double amount, String dueDate) {
        this.type = type;
        this.amount = amount;
        this.dueDate = dueDate;
        this.isPaid = false;
    }

    // Operator used for late fee
    public double calculateLateFee(double penalty) {
        return amount + penalty;
    }

    public boolean isPaid() {
        return isPaid;
    }

    @Override
    public void pay(double paidAmount) {
        if (paidAmount >= amount) {
            isPaid = true;
            System.out.println(type + " bill paid successfully.");
        } else {
            System.out.println("Insufficient amount for " + type + " bill.");
        }
    }
}
