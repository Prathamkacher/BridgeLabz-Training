package com.day7.tourmate;

public abstract class Trip implements IBookable {
	
	protected String destination;
	protected double budget;
	protected int duration;
	
	protected Transport transport;
	protected Hotel hotel;
	protected Activity activity;
	
	public Trip(String destination, int duration, Transport transport, Hotel hotel, Activity activity) {
		this.destination = destination;
		this.duration = duration;
		this.transport = transport;
		this.hotel = hotel;
		this.activity = activity;
		
		this.budget = calculateTotalBudget();
	}
	
	private double calculateTotalBudget() {
		return transport.getCost() + hotel.getTotalCost() + activity.getCost();
	}
	
	public void showTripDetails() {
		System.out.println("Destination: " + destination);
		System.out.println("Duration: " + duration);
		System.out.println("Budget: " + budget);
	}
}
