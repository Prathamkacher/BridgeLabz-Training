package com.day5.personalfitnesstracker;

abstract class Workout implements ITrackable {
	
	protected String type;
	protected int duration; // minutes
	protected double caloriesBurned;

    protected Workout(String type, int duration) {
    	this.type = type;
	    this.duration = duration;
	}
    
    @Override
    public void startWorkout() {
        System.out.println("\n"+type + " workout started");
    }

    @Override
    public void stopWorkout() {
        System.out.println(type + " workout stopped");
    }
    
 // Polymorphic method
    public abstract double calculateCalories(double weight);

    public double getCaloriesBurned() {
        return caloriesBurned;
    }
}
