package com.day10.birdsantuary;

import java.util.*;

public class SanctuaryManager {

    private ArrayList<Bird> birds = new ArrayList<>();

    public void addBird(Bird b) {
        birds.add(b);
        System.out.println("Bird added successfully.");
    }

    public void displayAll() {
        for (Bird b : birds) {
            b.display();
        }
    }

    public void showFlyingBirds() {
        for (Bird b : birds) {
            if (b instanceof Flyable) {
                b.display();
                ((Flyable) b).fly();   // polymorphism
            }
        }
    }

    public void showSwimmingBirds() {
        for (Bird b : birds) {
            if (b instanceof Swimmable) {
                b.display();
                ((Swimmable) b).swim();
            }
        }
    }

    public void showBoth() {
        for (Bird b : birds) {
            if (b instanceof Flyable && b instanceof Swimmable) {
                b.display();
            }
        }
    }

    public void removeById(String id) {
        birds.removeIf(b -> b.getId().equals(id));
        System.out.println("Bird removed if existed.");
    }

    public void report() {
        int fly = 0, swim = 0, both = 0, none = 0;

        for (Bird b : birds) {
            boolean f = b instanceof Flyable;
            boolean s = b instanceof Swimmable;

            if (f && s) both++;
            else if (f) fly++;
            else if (s) swim++;
            else none++;
        }

        System.out.println("\nSanctuary Report:");
        System.out.println("Flyable: " + fly);
        System.out.println("Swimmable: " + swim);
        System.out.println("Both: " + both);
        System.out.println("Neither: " + none);
    }
}
