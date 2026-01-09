package com.day7.medistore;

public abstract class Medicine implements ISellable {
	
	private String name;
	private double price;
	private String expiryDate;
	private int quantity;
	
	
	// Default quantity constructor
	public Medicine(String name, double price, String expiryDate) {
		this.name = name;
		this.price = price;
		this.expiryDate = expiryDate;
		this.quantity = 10;
	}
	
	// Custom quantity constructor
	public Medicine(String name, double price, String expiryDate, int quantity) {
		this.name = name;
		this.price = price;
		this.expiryDate = expiryDate;
		this.quantity = quantity;
	}
	
	private double calculateDiscount(double totalPrice) {
		return totalPrice * 0.10;
	}
	
	@Override
	public void sell(int qty) {
		
		if(qty > quantity) {
			System.out.println("Not enough stock availabe");
			return;
		}
		
		double totalPrice = price * qty;
		double discount = calculateDiscount(totalPrice);
		double finalAmount = totalPrice - discount;
		
		quantity = quantity - qty; // Update current stock
		
		System.out.println("Sold " + qty + " units");
		System.out.println("Final Price: " + finalAmount);
	}
	
	public int getQuantity() {
		return quantity;
	}
}
