package com.constructorandaccessmodifiers.level1;

public class Circle {
	
	// Attribute
    double radius;

    // Default constructor
    public Circle() {
        this(1.0); // calls parameterized constructor
    }

    // Parameterized constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate area
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to display details
    public void display() {
        System.out.println("Radius: " + radius);
        System.out.println("Area  : " + calculateArea());
    }

    // Main method for testing
	public static void main(String[] args) {
		// Using default constructor
        Circle c1 = new Circle();
        c1.display();

        System.out.println();

        // Using parameterized constructor
        Circle c2 = new Circle(5.5);
        c2.display();
	}
}