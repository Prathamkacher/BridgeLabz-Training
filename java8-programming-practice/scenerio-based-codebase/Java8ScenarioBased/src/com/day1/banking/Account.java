package com.day1.banking;

public class Account {
    private String accountHolder;
    private double balance;
    private int years;

    public Account(String accountHolder, double balance, int years) {
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.years = years;
    }

    public String getAccountHolder() { return accountHolder; }
    public double getBalance() { return balance; }
    public int getYears() { return years; }

    @Override
    public String toString() {
        return accountHolder + " | Balance: " + balance + " | Years: " + years;
    }
}
