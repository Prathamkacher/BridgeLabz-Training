package com.day1.banking;

import java.util.*;

public class BankingMain {

    public static void main(String[] args) {

        List<Account> accounts = Arrays.asList(
                new Account("Aryaman", 15000, 2),
                new Account("Aryan", 800, 3),
                new Account("Harsh", 7000, 4)
        );

        System.out.println("---- Minimum Balance Check ----");
        accounts.forEach(acc ->
                System.out.println(acc.getAccountHolder() + " valid? " +
                        BankService.minimumBalanceRule.test(acc)));

        System.out.println("\n---- Interest Calculation (Rate 5%) ----");
        accounts.forEach(acc ->
                System.out.println(acc.getAccountHolder() + " Interest: " +
                        BankService.calculateInterest.apply(acc, 5.0)));

        System.out.println("\n---- Withdrawal Validation (Amount 2000) ----");
        accounts.forEach(acc ->
                System.out.println(acc.getAccountHolder() + " can withdraw? " +
                        BankService.validateWithdrawal.test(acc, 2000.0)));

        System.out.println("\n---- Account Details ----");
        accounts.forEach(BankService.printAccount);

        System.out.println("\n---- Compare Two Accounts ----");
        System.out.println(BankService.compareBalance.apply(accounts.get(0), accounts.get(2)));
    }
}
