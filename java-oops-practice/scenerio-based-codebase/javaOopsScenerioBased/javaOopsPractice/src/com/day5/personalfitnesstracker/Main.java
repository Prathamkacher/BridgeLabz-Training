/*
 * 11. "FitTrack – Your Personal Fitness Tracker"
Story: You’ve been hired to develop FitTrack, a fitness tracking app that monitors users'
workouts, calories, and daily progress.
Requirements:
● UserProfile class with fields like name, age, weight, goal.
● Workout class to track type, duration, caloriesBurned.
● Constructors to allow user creation with default or custom goals.
● ITrackable interface with startWorkout() and stopWorkout() methods.
● Use encapsulation to protect private health data (e.g., weight).
● Operators to compute calorie targets and progress (dailyTarget -
caloriesBurned).
● Inheritance: CardioWorkout, StrengthWorkout extend Workout.
● Polymorphism: calculateCalories() differs by workout type.
● Access modifiers to restrict internal workout logs from being exposed directly.
 */

package com.day5.personalfitnesstracker;

public class Main {
	public static void main(String[] args) {

        UserProfile user = new UserProfile(
                "Pratham",
                22,
                65,
                "Weight Loss"
        );
        
        user.showProfile();

        //Cardio Workout
        Workout workout = new CardioWorkout(30);

        workout.startWorkout();

        double calories = workout.calculateCalories(user.getWeight());

        workout.stopWorkout();

        double dailyTarget = 500;
        double progress = dailyTarget - calories; // operator used

        System.out.println("\n--- Cardio Workout Summary ---");
        System.out.println("Calories Burned: " + calories);
        System.out.println("Remaining Calories to Target: " + progress + "\n");
        
        //Strength Workout
        Workout strength = new StrengthWorkout(40);
        strength.startWorkout();

        double strengthCalories = strength.calculateCalories(user.getWeight());

        strength.stopWorkout();

        double strengthProgress = dailyTarget - strengthCalories;

        System.out.println("\n--- Strength Workout Summary ---");
        System.out.println("Calories Burned: " + strengthCalories);
        System.out.println("Remaining Calories to Target: " + strengthProgress);
    }
}
