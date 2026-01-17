package com.day6.fleetmanager;

public class Vehicle {
	String id;
	int mileage;
	
	public Vehicle(String id, int mileage) {
		this.id = id;
		this.mileage = mileage;
	}
	
	public String toString() {
		return id + " (" + mileage + "km)" ;
	}
}
