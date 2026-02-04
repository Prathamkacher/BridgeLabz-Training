package com.banktransactions;

public class TransactionMain {
    public static void main(String[] args) throws InterruptedException {

        Bank bank = new Bank();

        // Create customer threads
        Customer c1 = new Customer(bank, 101, "Customer-1");
        Customer c2 = new Customer(bank, 101, "Customer-2");
        Customer c3 = new Customer(bank, 102, "Customer-3");

        // Start threads
        c1.start();
        c2.start();
        c3.start();

        // Wait for all threads to finish
        c1.join();
        c2.join();
        c3.join();

        // Final balances
        System.out.println("\n===== FINAL BALANCES =====");
        System.out.println("Account 101: ₹" + bank.getBalance(101));
        System.out.println("Account 102: ₹" + bank.getBalance(102));
        System.out.println("Account 103: ₹" + bank.getBalance(103));
    }
}
