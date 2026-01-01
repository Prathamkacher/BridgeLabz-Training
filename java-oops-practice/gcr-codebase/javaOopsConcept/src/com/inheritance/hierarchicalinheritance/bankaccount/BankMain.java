package com.inheritance.hierarchicalinheritance.bankaccount;

public class BankMain {
    public static void main(String[] args) {

        BankAccount s = new SavingsAccount(1111, 50000, 4.5);
        BankAccount c = new CheckingAccount(2222, 30000, 20000);
        BankAccount f = new FixedDepositAccount(3333, 100000, 24);

        s.displayDetails();
        ((SavingsAccount) s).displayAccountType();
        System.out.println();

        c.displayDetails();
        ((CheckingAccount) c).displayAccountType();
        System.out.println();

        f.displayDetails();
        ((FixedDepositAccount) f).displayAccountType();
    }
}
