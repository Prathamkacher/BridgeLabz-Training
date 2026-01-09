package com.day7.tourmate;

public class Activity {

	private double activityCost;
	
	public Activity(double activityCost) {
		this.activityCost = activityCost;
	}
	
	double getCost() {
		return activityCost;
	}
}
