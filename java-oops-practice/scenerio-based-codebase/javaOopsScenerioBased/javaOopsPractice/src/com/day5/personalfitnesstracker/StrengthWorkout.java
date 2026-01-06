package com.day5.personalfitnesstracker;

public class StrengthWorkout extends Workout {
	public StrengthWorkout(int duration) {
        super("Strength", duration);
    }

    @Override
    public double calculateCalories(double weight) {
        caloriesBurned = duration * weight * 0.05;
        return caloriesBurned;
    }
}
