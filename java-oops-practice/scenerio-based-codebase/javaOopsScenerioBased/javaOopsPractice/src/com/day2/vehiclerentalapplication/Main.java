/*2. Vehicle Rental Application
Scenario: Build a system for renting bikes, cars, and trucks to customers.
Concepts Used:
● Class: Vehicle, Bike, Car, Truck, Customer

Scenario-based Problems
● Constructors: Custom constructors for different vehicle types
● Access Modifiers: protected for vehicle attributes to allow subclass access
● Interface: Rentable with method calculateRent(int days)
● Operators: Used in rent calculation (e.g., baseRate × days ± surcharges)
● OOP:
○ Abstraction: Rentable abstracts rental behavior
○ Inheritance: Car, Bike, Truck inherit from Vehicle
○ Polymorphism: Rent calculation differs by vehicle type
○ Encapsulation: All fields hidden behind getters/setters
*/

package com.day2.vehiclerentalapplication;

public class Main {
    public static void main(String[] args) {

        Rentable bike = new Bike(101, "Yamaha", 300);
        Rentable car = new Car(201, "Honda", 1200);
        Rentable truck = new Truck(301, "Tata", 2000);

        Customer customer = new Customer(1, "Yadav");

        customer.rentVehicle(bike, 3);
        customer.rentVehicle(car, 2);
        customer.rentVehicle(truck, 1);
    }
}
