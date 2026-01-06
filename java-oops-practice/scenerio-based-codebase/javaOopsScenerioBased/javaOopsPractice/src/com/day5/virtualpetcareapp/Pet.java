package com.day5.virtualpetcareapp;

import java.util.Random;

abstract class Pet implements IInteractable {

    protected String name;
    protected String type;
    protected int age;

    private int hunger;  // 0 = full, 100 = very hungry
    private int energy;  // 0 = tired, 100 = energetic
    private String mood;

    // Random default constructor
    public Pet(String name, String type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;

        Random rand = new Random();
        this.hunger = rand.nextInt(41) + 30;  // 30–70
        this.energy = rand.nextInt(41) + 30;
        updateMood();
    }

    protected void updateMood() {
        if (hunger < 30 && energy > 60)
            mood = "Happy";
        else if (hunger > 70)
            mood = "Hungry";
        else if (energy < 30)
            mood = "Tired";
        else
            mood = "Normal";
    }

    public void showStatus() {
        System.out.println("Hunger: " + hunger);
        System.out.println("Energy: " + energy);
        System.out.println("Mood: " + mood);
    }

    @Override
    public void feed() {
        hunger -= 20;
        if (hunger < 0) hunger = 0;
        updateMood();
        System.out.println(name + " has been fed.");
    }

    @Override
    public void play() {
        energy -= 15;
        hunger += 15;
        updateMood();
        System.out.println(name + " played happily.");
    }

    @Override
    public void sleep() {
        energy += 25;
        if (energy > 100) energy = 100;
        updateMood();
        System.out.println(name + " is sleeping.");
    }

    public abstract void makeSound();
}
