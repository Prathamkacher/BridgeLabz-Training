package com.constructorandaccessmodifiers.level1;

public class Person {
	
	// Attributes
    String name;
    int age;
    String gender;

    // Parameterized constructor
    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // Copy constructor
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
        this.gender = other.gender;
    }

    // Method to display person details
    public void display() {
        System.out.println("Name   : " + name);
        System.out.println("Age    : " + age);
        System.out.println("Gender : " + gender);
    }

    // Main method for testing
	public static void main(String[] args) {
		// Original object
        Person p1 = new Person("Krishna Gangrape", 22, "Male");

        // Cloned object using copy constructor
        Person p2 = new Person(p1);

        System.out.println("Original Person:");
        p1.display();

        System.out.println("\nCloned Person:");
        p2.display();

	}
}