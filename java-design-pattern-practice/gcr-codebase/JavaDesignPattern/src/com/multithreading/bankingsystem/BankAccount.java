package com.multithreading.bankingsystem;

public class BankAccount {

	private int balance = 10000;

	public synchronized void  withdraw(String customer, int amount) {
		System.out.println(customer + " - attempting to withdraw: " + amount);

		if (balance >= amount) {
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			balance -= amount;

			System.out.println(customer + " - Withdrawl Success | " + "Amount: " + amount + " | Time: "
					+ java.time.LocalTime.now() + " | Remaining Balance: " + balance);
		} else {
			System.out.println(customer + " - Withdrawl Failed | Insufficient Balance | Time: " + java.time.LocalTime.now());
		}
	}
}
