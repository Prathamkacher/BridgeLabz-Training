package com.day7.tourmate;

public class InternationalTrip extends Trip {
	
	InternationalTrip(String destination, int duration, Transport transport, Hotel hotel, Activity activity) {
		super(destination, duration, transport, hotel, activity);
	}
	
	@Override
	public void book() {
		System.out.println("Booking internation trip to: " + destination);
	}
	
	@Override
	public void cancel() {
		System.out.println("International trip cancelled");
	}
}
