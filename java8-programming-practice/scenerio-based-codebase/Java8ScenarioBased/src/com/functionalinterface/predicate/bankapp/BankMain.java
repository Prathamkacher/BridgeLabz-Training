package com.functionalinterface.predicate.bankapp;

import java.util.function.Predicate;

public class BankMain {

    public static void main(String[] args) {

        Account acc = new Account("Aryaman", 50000);
        double withdrawalAmount = 12000;

        Predicate<Double> isValidWithdrawal = amt -> amt > 0 && amt <= acc.getBalance();

        processWithdrawal(acc, withdrawalAmount, isValidWithdrawal);
    }

    public static void processWithdrawal(Account acc, double amount, Predicate<Double> rule) {
        if (rule.test(amount)) {
            acc.withdraw(amount);
            System.out.println("Withdrawal successful. Remaining balance: " + acc.getBalance());
        } else {
            System.out.println("Invalid withdrawal amount!");
        }
    }
}
