package com.day3.mybank;

abstract class Account implements ITransaction {
    protected String accountNumber;
    private double balance;   // sensitive data

    // Constructor without opening balance
    Account(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    // Constructor with opening balance
    Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    protected double getBalanceValue() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: ₹" + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    @Override
    public void checkBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }

    // Polymorphism
    abstract void calculateInterest();
}
