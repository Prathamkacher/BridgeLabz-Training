package com.day7.tourmate;

public class Hotel {
	
	private double costPerNight;
	private int nights;
	
	public Hotel(double costPerNight, int nights) {
		this.costPerNight = costPerNight;
		this.nights = nights;
	}
	
	double getTotalCost() {
		return costPerNight * nights;
	}
}
