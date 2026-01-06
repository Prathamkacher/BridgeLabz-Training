package com.day5.personalfitnesstracker;

public class UserProfile {
	private String name;
    private int age;
    private double weight;   // protected health data
    private String goal;

    // Default goal constructor
    public UserProfile(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.goal = "Stay Fit";
    }
    
 // Custom goal constructor
    public UserProfile(String name, int age, double weight, String goal) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.goal = goal;
    }

    public double getWeight() {
        return weight; // controlled access
    }

    public String getGoal() {
        return goal;
    }
    
    public void showProfile() {
        System.out.println("Goal: " + goal);
    }
}
