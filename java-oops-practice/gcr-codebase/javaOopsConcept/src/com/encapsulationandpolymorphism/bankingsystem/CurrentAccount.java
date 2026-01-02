package com.encapsulationandpolymorphism.bankingsystem;

public class CurrentAccount extends BankAccount {

    public CurrentAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * 0.01; // 1% interest
    }
}
