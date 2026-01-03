package com.day1.bankaccount;

public class Account {
	protected int accountNumber;
	protected double balance; 
	
	public Account(int accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		if(amount > 0) {
			balance += amount;
			System.out.println("Deposited Amount: " + amount);
		}
	}
	
	public void withdraw(double amount) {
		if(amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("Withdrawn Amount: " + amount);
		} else {
			System.out.println("Insufficient Balance!");
		}
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public void displayBalance() {
		System.out.println("Balance: " + balance);
	}
	
}