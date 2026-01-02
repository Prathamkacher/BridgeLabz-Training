package com.day2.universitycoursesystem;

class Student {
    protected int studentId;
    protected String name;

    private double totalGradePoints;
    private int courseCount;

    // Normal constructor
    Student(int id, String name) {
        this.studentId = id;
        this.name = name;
    }

    // Constructor with elective preference
    Student(int id, String name, String elective) {
        this.studentId = id;
        this.name = name + " (Elective: " + elective + ")";
    }

    protected void addGradePoint(double gradePoint) {
        totalGradePoints += gradePoint;
        courseCount++;
    }

    public double getGPA() {
        if (courseCount == 0)
            return 0.0;
        return totalGradePoints / courseCount;
    }

    public void displayTranscript() {
        System.out.println("Student: " + name + ", GPA: " + getGPA());
    }
}