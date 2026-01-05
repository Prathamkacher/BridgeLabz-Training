package com.day4.collegeinfosystem;

class Person {
    protected int id;
    protected String name;
    protected String email;

    // Constructor
    Person(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    // Polymorphic method
    void printDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
    }
}
