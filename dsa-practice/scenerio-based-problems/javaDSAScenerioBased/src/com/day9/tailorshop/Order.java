package com.day9.tailorshop;

public class Order {
	String orderId;
	int deadline;
	
	public Order(String orderId, int deadline) {
		this.orderId = orderId;
		this.deadline = deadline;
	}
	
	@Override
	public String toString() {
		return orderId + " - Deadline Day: " + deadline;
	}
}
