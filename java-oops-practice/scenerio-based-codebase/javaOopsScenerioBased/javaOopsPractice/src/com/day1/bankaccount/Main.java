package com.day1.bankaccount;

public class Main {
	public static void main (String[] args) {
		SavingsAccount savings = new SavingsAccount(101, 50000, 5);
		Customers customer1 = new Customers("Aryaman", savings);
	
		customer1.showDetails();
		savings.deposit(2000);
		savings.withdraw(1000);
		savings.calculateInterest();
		customer1.showDetails();
		
		
		CurrentAccount current = new CurrentAccount(102, 100000);
		Customers customer2 = new Customers("Pratham", current);
		
		customer2.showDetails();
		current.withdraw(2000);
		customer2.showDetails();
	}	
}
