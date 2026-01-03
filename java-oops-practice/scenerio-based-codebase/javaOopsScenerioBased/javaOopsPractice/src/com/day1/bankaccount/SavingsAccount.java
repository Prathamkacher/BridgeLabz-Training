package com.day1.bankaccount;

public class SavingsAccount extends Account {
	private double interestRate;
	
	public SavingsAccount(int accountNumber, double balance, double interestRate) {
		super(accountNumber, balance);
		this.interestRate = interestRate;
	}
	
	public void calculateInterest() {
		double interest = balance * interestRate  / 100;
		balance += interest;
		System.out.println("Interest Added: " + interest);
	}
}
