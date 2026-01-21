package com.day9.medwarehouse;

public class Medicine {
	String name;
	int expiryDays;
	
	public Medicine(String name, int expiryDays) {
		this.expiryDays = expiryDays;
		this.name = name;
	}
	
	public String toString() {
		return name + " - Expires in " + expiryDays + " days";
	}
}
