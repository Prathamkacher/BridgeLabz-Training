/*
 7. "MyBank – Managing Customer Accounts"
Story: You're building the core banking module for MyBank, a digital-first bank. Your job is to
manage customer accounts, deposits, and interest calculations.
Requirements:
● Account (base class): fields like accountNumber, balance.
● Derived classes: SavingsAccount, CurrentAccount (using inheritance).
● ITransaction interface: deposit(), withdraw(), checkBalance().
● Use constructors for account initialization with or without an opening balance.
● Encapsulation: balance must be private and only modifiable through methods.
● Use operators for interest: balance * interestRate / 100.
● Polymorphism in calculateInterest() – varies by account type.
● Use access modifiers: protect account data, expose only required operations.
 */

package com.day3.mybank;

public class Main {
    public static void main(String[] args) {

        Account savings = new SavingsAccount("SB101", 5000);
        Account current = new CurrentAccount("CA201", 10000);

        savings.deposit(2000);
        savings.calculateInterest();
        savings.checkBalance();

        System.out.println();

        current.withdraw(3000);
        current.calculateInterest();
        current.checkBalance();
    }
}
