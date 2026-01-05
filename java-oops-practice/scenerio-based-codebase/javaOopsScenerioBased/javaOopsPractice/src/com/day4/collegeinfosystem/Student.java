package com.day4.collegeinfosystem;

import java.util.*;

class Student extends Person implements ICourseActions {

    private ArrayList<Integer> grades;   // Encapsulation (private)
    private ArrayList<Course> courses;

    Student(int id, String name, String email) {
        super(id, name, email);
        grades = new ArrayList<>();
        courses = new ArrayList<>();
    }

    // Add grade
    void addGrade(int grade) {
        grades.add(grade);
    }

    // GPA calculation using operators
    double calculateGPA() {
        int sum = 0;
        for (int g : grades) {
            sum += g;
        }
        return grades.size() == 0 ? 0 : (double) sum / grades.size();
    }

    // Interface methods
    public void enrollCourse(Course course) {
        courses.add(course);
        course.addStudent(this);
    }

    public void dropCourse(Course course) {
        courses.remove(course);
        course.removeStudent(this);
    }

    // Polymorphism
    @Override
    void printDetails() {
        super.printDetails();
        System.out.println("Role: Student");
        System.out.println("GPA: " + calculateGPA());
    }
}
