package com.collections.BankingSystem;

public class BankingMain {

    public static void main(String[] args) {

        Bank bank = new Bank();

        bank.addAccount(101, 500);
        bank.addAccount(102, 1200);
        bank.addAccount(103, 300);

        bank.requestWithdrawal(101, 200);
        bank.requestWithdrawal(102, 4000);
        bank.requestWithdrawal(103, 100);

        bank.processWithdrawals();
        System.out.println();
        bank.displaySortedByBalance();
    }
}
