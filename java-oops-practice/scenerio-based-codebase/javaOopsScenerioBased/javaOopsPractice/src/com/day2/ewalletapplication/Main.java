/*
 4. E-Wallet Application
Scenario: Users can register, load money, transfer funds, and view transaction history.
Concepts Used:
● Class: User, Wallet, Transaction
● Constructors: Initialize wallets with optional referral bonus
● Access Modifiers: Make balance private, expose via getBalance()
● Interface: Transferrable with method transferTo(User receiver, double
amount)
● Operators: Used in deductions, taxes, referral credits
● OOP:
○ Encapsulation: Prevent direct manipulation of balance
○ Abstraction: Expose only essential transaction methods
○ Inheritance: PersonalWallet, BusinessWallet with different limits
○ Polymorphism: Same transferTo() method but different business logic
*/

package com.day2.ewalletapplication;

public class Main {
    public static void main(String[] args) {

        Wallet personalWallet = new PersonalWallet("PW101", 100); // referral bonus
        Wallet businessWallet = new BusinessWallet("BW201", 500);

        User user1 = new User(1, "Amit", personalWallet);
        User user2 = new User(2, "Rohit", businessWallet);

        personalWallet.addMoney(1000);

        personalWallet.transferTo(user2, 300);
        businessWallet.transferTo(user1, 200);

        System.out.println("Amit Balance: ₹" + user1.getWallet().getBalance());
        System.out.println("Rohit Balance: ₹" + user2.getWallet().getBalance());
    }
}
