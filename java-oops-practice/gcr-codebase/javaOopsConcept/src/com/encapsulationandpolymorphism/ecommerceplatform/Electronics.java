package com.encapsulationandpolymorphism.ecommerceplatform;

public class Electronics extends Product implements Taxable {
	
	public Electronics(int id, String name, double price) {
		super(id, name, price);
	}
	
	@Override
	public double calculateDiscount() {
		return getPrice() * 0.10; // discount 10%
	}
	
	@Override
	public double calculateTax() {
		return getPrice() * 0.18; // gst 18%
	}
	
    @Override
    public String getTaxDetails() {
        return "Electronics GST: 18%";
    }
}
