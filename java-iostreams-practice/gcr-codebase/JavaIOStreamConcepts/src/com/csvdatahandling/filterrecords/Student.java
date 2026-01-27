package com.csvdatahandling.filterrecords;

public class Student {
    int id;
    String name;
    int age;
    int marks;

    Student(int id, String name, int age, int marks) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    void print() {
        System.out.println(
            "ID: " + id +
            ", Name: " + name +
            ", Age: " + age +
            ", Marks: " + marks
        );
    }
}
