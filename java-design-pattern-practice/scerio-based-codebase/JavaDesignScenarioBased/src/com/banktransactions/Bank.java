package com.banktransactions;

import java.util.HashMap;
import java.util.Map;

class Bank {

    // Stores accountNumber -> balance
    private Map<Integer, Integer> accounts = new HashMap<>();

    // Constructor: initialize accounts
    public Bank() {
        accounts.put(101, 1000);
        accounts.put(102, 2000);
        accounts.put(103, 3000);
    }

    // Deposit method
    public synchronized void deposit(int accountNumber, int amount) {
        int currentBalance = accounts.get(accountNumber);
        System.out.println(Thread.currentThread().getName() +
                " depositing ₹" + amount + " into Account " + accountNumber);

        currentBalance += amount;
        accounts.put(accountNumber, currentBalance);

        System.out.println("Updated Balance (Acc " + accountNumber + "): ₹" + currentBalance);
    }

    // Withdraw method
    public synchronized void withdraw(int accountNumber, int amount) {
        int currentBalance = accounts.get(accountNumber);
        System.out.println(Thread.currentThread().getName() +
                " withdrawing ₹" + amount + " from Account " + accountNumber);

        if (currentBalance >= amount) {
            currentBalance -= amount;
            accounts.put(accountNumber, currentBalance);
            System.out.println("Withdrawal successful. Balance (Acc " + accountNumber + "): ₹" + currentBalance);
        } else {
            System.out.println("Insufficient balance in Account " + accountNumber);
        }
    }

    // Get balance
    public synchronized int getBalance(int accountNumber) {
        return accounts.get(accountNumber);
    }
}
