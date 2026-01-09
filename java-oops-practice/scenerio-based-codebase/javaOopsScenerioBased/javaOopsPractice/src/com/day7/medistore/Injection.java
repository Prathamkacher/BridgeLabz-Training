package com.day7.medistore;

public class Injection extends Medicine {
	
	public Injection(String name, double price, String expiryDate, int quantity) {
		super(name, price, expiryDate, quantity);
	}
	
	@Override
	public boolean checkExpiry() {
		System.out.println("Injection needs strict cold storage");
		return false;
	}
}
