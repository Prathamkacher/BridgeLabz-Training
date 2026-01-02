package com.encapsulationandpolymorphism.ecommerceplatform;

public abstract class Product {
	
	private int productId;
	private String name;
	private double price;
	
	public Product(int productId, String name, double price) {
		this.productId = productId;
		this.name = name;
		this.price = price;
	}
	
	public abstract double calculateDiscount();
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		if(price > 0) {
			this.price = price;
		}
	}
	
	public String getName() {
		return name;
	}
	
	public void displayBasicInfo() {
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Base Price: " + price);
	}

}
