package com.objectmodelling.school;

import java.util.ArrayList;

public class Course {

    private String courseName;
    private ArrayList<Student> students;

    // Constructor
    public Course(String courseName) {
        this.courseName = courseName;
        students = new ArrayList<>();
    }

    // Add student to course
    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    // View enrolled students
    public void viewStudents() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Enrolled Students:");

        for (Student student : students) {
            System.out.println("- " + student.getStudentName());
        }
        System.out.println();
    }

    public String getCourseName() {
        return courseName;
    }
}
