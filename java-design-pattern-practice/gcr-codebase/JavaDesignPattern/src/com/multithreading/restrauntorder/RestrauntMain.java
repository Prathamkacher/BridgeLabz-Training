package com.multithreading.restrauntorder;

public class RestrauntMain {

	public static void main(String[] args) throws InterruptedException {

		Chef c1 = new Chef("Chef-1", "Pizza", 3000);
		Chef c2 = new Chef("Chef-2", "Burger", 2000);
		Chef c3 = new Chef("Chef-3", "Pasta", 3500);
		Chef c4 = new Chef("Chef-4", "Biryani", 2500);
		
		
		c1.start();
		c2.start();
		c3.start();
		c4.start();
		
		
		c1.join();
		c2.join();
		c3.join();
		c4.join();
		
		System.out.println("\nKitchen closed..... TATA....BYE...BYE...");
	}
}
