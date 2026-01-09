package com.day7.medistore;

public class Syrup extends Medicine {
	
	public Syrup(String name, double price, String expiryDate, int quantity) {
		super(name, price, expiryDate, quantity);
	}
	
	@Override
	public boolean checkExpiry() {
		System.out.println("Syrup expires faster after opening");
		return false;
	}
}
