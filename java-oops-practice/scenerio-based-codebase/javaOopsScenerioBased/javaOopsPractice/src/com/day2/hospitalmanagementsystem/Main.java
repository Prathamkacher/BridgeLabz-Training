/*
 1. Hospital Patient Management System
Scenario: A hospital wants a software module to register patients, assign doctors, and maintain
billing.
Concepts Used:
● Class: Patient, Doctor, Bill
● Constructor: Overloaded for emergency vs. normal patient admission
● Access Modifiers: Keep sensitive data like medicalHistory as private, expose
getSummary() via public
● Interface: Payable with method calculatePayment() implemented in Bill
● Operators: Used to compute discounts, taxes, totals
● OOP:
○ Encapsulation: Private fields with getter/setters
○ Abstraction: Hide billing calculation behind interface
○ Inheritance: InPatient, OutPatient extend Patient
○ Polymorphism: displayInfo() overridden for Doctor, Patient, etc.
 */

package com.day2.hospitalmanagementsystem;

public class Main {
    public static void main(String[] args) {

        Patient p1 = new InPatient(101, "Rohit", "Diabetes", 5);
        Patient p2 = new OutPatient(102, "Amit", "12-01-2026");

        Doctor d1 = new Doctor(201, "Dr. Sharma", "Cardiology");

        Bill bill = new Bill(5000, 0.18, 500);

        p1.displayInfo();
        p2.displayInfo();
        d1.displayInfo();

        System.out.println("Total Bill Amount: ₹" + bill.calculatePayment());
    }
}