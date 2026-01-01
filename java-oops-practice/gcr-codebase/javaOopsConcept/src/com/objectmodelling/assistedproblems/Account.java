package com.objectmodelling.assistedproblems;

class Account {
    private double balance;
    private Bank bank;

    Account(Bank bank, double balance) {
        this.bank = bank;
        this.balance = balance;
    }

    double getBalance() {
        return balance;
    }

    Bank getBank() {
        return bank;
    }
}
