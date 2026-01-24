package com.exceptions.banktransactionsystem;

public class BankMain {

    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        try {
            account.withdraw(1200);
        } catch (InsufficientBalanceException e) {
            System.out.println("Insufficient balance!");
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid amount!");
        }
    }
}
