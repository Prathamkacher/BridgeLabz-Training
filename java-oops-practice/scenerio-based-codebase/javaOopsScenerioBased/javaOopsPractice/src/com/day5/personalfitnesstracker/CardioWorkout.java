package com.day5.personalfitnesstracker;

public class CardioWorkout extends Workout {
	public CardioWorkout(int duration) {
        super("Cardio", duration);
    }

    @Override
    public double calculateCalories(double weight) {
        caloriesBurned = duration * weight * 0.08;
        return caloriesBurned;
    }
}
