package com.inheritance.assistedproblems.animalhierarchy;

public class AnimalMain {
	public static void main (String[] args) {
		
		Animal animal1 = new Dog("Bruno", 5);
		Animal animal2 = new Cat("Sherry", 2);
		Animal animal3 = new Bird("Chi Chi", 1);
		
		animal1.makeSound();
		animal2.makeSound();
		animal3.makeSound();
	}
}
