package com.day1.bankaccount;

public class Customers {
	private String name;
	private Account account;
	
	public Customers(String name, Account account) {
		this.name = name;
		this.account = account;
	}
	
	public void showDetails() {
		System.out.println("Customer Name: " + name);
		System.out.println("Account Number: " + account.accountNumber);
		account.displayBalance();
	}
	
	public Account getAccount() {
		return account;
	}
}
