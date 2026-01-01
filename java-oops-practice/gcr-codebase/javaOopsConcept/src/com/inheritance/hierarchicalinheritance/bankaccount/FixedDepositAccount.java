package com.inheritance.hierarchicalinheritance.bankaccount;

public class FixedDepositAccount extends BankAccount {
    int maturityPeriod; // in months

    FixedDepositAccount(int accountNumber, double balance, int maturityPeriod) {
        super(accountNumber, balance);
        this.maturityPeriod = maturityPeriod;
    }

    void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
    }
}
