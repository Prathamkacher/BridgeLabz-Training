package com.day7.medistore;

public class Tablet extends Medicine {
	
	public Tablet(String name, double price, String expiryDate, int quantity) {
		super(name, price, expiryDate, quantity);
	}
	
	public boolean checkExpiry() {
		System.out.println("Tablet have long shelf life");
		return true;
	}
}
