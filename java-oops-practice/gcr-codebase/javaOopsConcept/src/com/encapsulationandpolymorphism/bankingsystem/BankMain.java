package com.encapsulationandpolymorphism.bankingsystem;

import java.util.ArrayList;
import java.util.List;

public class BankMain {

    public static void main(String[] args) {

        List<BankAccount> accounts = new ArrayList<>();

        BankAccount acc1 = new SavingsAccount("SB12345678", "Aryaman", 80000);
        BankAccount acc2 = new CurrentAccount("CA98765432", "Rohit", 120000);

        accounts.add(acc1);
        accounts.add(acc2);

        for (BankAccount account : accounts) {

            account.displayAccountDetails();

            double interest = account.calculateInterest();
            System.out.println("Interest Earned: " + interest);

            if (account instanceof Loanable) {
                Loanable loanAcc = (Loanable) account;
                loanAcc.applyForLoan(50000);
                System.out.println("Loan Eligible: " + loanAcc.calculateLoanEligibility());
            }

            System.out.println("-----------------------------");
        }
    }
}
