/*
 * 12. "PetPal – Virtual Pet Care App"
Story: You’re creating PetPal, an app that allows users to adopt and care for virtual pets like
dogs, cats, and birds.
Requirements:
● Pet base class: name, type, age.
● Derived classes: Dog, Cat, Bird (use inheritance).
● IInteractable interface with methods like feed(), play(), sleep().
● Encapsulation of hunger and mood levels.
● Use constructors to assign random default values or user-specified pets.
● Operators to increase/decrease energy, hunger based on interactions.
● Polymorphism: makeSound() behaves differently for each pet.
● Access modifiers ensure internal mood status is only modifiable through methods.
 */

package com.day5.virtualpetcareapp;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("🐾 Welcome to PetPal 🐾");

        System.out.print("Enter pet name: ");
        String name = sc.nextLine();

        System.out.print("Enter pet age: ");
        int age = sc.nextInt();

        System.out.println("Choose pet type:");
        System.out.println("1. Dog");
        System.out.println("2. Cat");
        System.out.println("3. Bird");
        int choice = sc.nextInt();

        Pet pet;

        switch (choice) {
            case 1:
                pet = new Dog(name, age);
                break;
            case 2:
                pet = new Cat(name, age);
                break;
            case 3:
                pet = new Bird(name, age);
                break;
            default:
                System.out.println("Invalid choice! Default pet is Dog.");
                pet = new Dog(name, age);
        }

        System.out.println("\nPet adopted successfully!");
        pet.makeSound();
        pet.showStatus();

        char action;
        do {
            System.out.println("\nChoose action:");
            System.out.println("1. Feed");
            System.out.println("2. Play");
            System.out.println("3. Sleep");
            System.out.println("4. Exit");

            int act = sc.nextInt();

            switch (act) {
                case 1:
                    pet.feed();
                    break;
                case 2:
                    pet.play();
                    break;
                case 3:
                    pet.sleep();
                    break;
                case 4:
                    System.out.println("Thanks for using PetPal!");
                    return;
                default:
                    System.out.println("Invalid action");
            }

            pet.showStatus();

            System.out.print("\nDo you want to continue? (y/n): ");
            action = sc.next().charAt(0);

        } while (action == 'y' || action == 'Y');

        System.out.println("Goodbye! Take care of your pet");
    }
}
