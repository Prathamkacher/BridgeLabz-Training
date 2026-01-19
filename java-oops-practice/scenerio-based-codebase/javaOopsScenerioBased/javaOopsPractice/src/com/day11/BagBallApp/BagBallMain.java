/*
2. Bag-n-Ball Organizer
 OOP Concepts:
Classes, Objects, Inheritance (optional), Encapsulation, Method Design
Scenario:
You’re building a toy storage system for TinyTown Play School, which wants to keep track of
bags and the balls inside them.
Each Bag has:
● A unique ID, color, and capacity (number of balls it can hold)
Each Ball has:
● A unique ID, color, and size (small/medium/large)

 Problem Statement:
Develop a Java system to:
● Add balls to a bag (up to capacity)
● Remove a ball from a bag
● Display all balls in a bag
● Display all bags and their ball count
● Prevent adding a ball if the bag is full

Encapsulate fields, use appropriate getters/setters, and model real-world object
relations through composition (i.e., Bag "has-a" list of Balls)
Bonus: Use an interface to define Storable behavior for both Bag and Ball.
*/

import java.util.*;

public class BagBallMain {

    public static void main(String[] args) {

        Bag bag1 = new Bag("B101", "Red", 2);
        Bag bag2 = new Bag("B102", "Blue", 3);

        Ball ball1 = new Ball("BALL1", "Yellow", "Small");
        Ball ball2 = new Ball("BALL2", "Green", "Medium");
        Ball ball3 = new Ball("BALL3", "Pink", "Large");

        bag1.addBall(ball1);
        bag1.addBall(ball2);
        bag1.addBall(ball3);   // Should fail (capacity reached)

        bag1.displayBalls();

        bag1.removeBall("BALL1");
        bag1.displayBalls();

        bag1.addBall(ball3);

        // Store all bags
        List<Bag> bags = new ArrayList<>();
        bags.add(bag1);
        bags.add(bag2);

        System.out.println("\nSystem Report:");
        for (Bag b : bags) {
            System.out.println("Bag " + b.getId() + " contains " + b.getBallCount() + " balls.");
        }
    }
}