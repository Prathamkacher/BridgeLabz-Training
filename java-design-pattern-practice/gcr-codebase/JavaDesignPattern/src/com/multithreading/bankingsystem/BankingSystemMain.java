package com.multithreading.bankingsystem;

public class BankingSystemMain {
	
	public static void main(String[] args) throws InterruptedException {
		
		BankAccount bankAccount = new BankAccount();
		
		Thread t1 = new Thread(new Transaction(bankAccount, "Customer-1", 3000), "T1");
		Thread t2 = new Thread(new Transaction(bankAccount, "Customer-2", 4000), "T2");
		Thread t3 = new Thread(new Transaction(bankAccount, "Customer-3", 2000), "T3");
		Thread t4 = new Thread(new Transaction(bankAccount, "Customer-4", 5000), "T4");
		Thread t5 = new Thread(new Transaction(bankAccount, "Customer-5", 1000), "T5");
		
		
		Thread[] threads = {t1, t2, t3, t4, t5};
		
		for(Thread t : threads) {
			System.out.println(t.getName() + " State before start: " + t.getState());
		}
		
		for(Thread t : threads) {
			t.start();
		}
		
		for(Thread t : threads) {
			t.join();
		}
		
		System.out.println("All transactions completed!");
	}
}
