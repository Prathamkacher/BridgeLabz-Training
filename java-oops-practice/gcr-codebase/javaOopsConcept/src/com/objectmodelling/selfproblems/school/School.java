package com.objectmodelling.school;

import java.util.ArrayList;

public class School {

    private String schoolName;
    private ArrayList<Student> students;

    // Constructor
    public School(String schoolName) {
        this.schoolName = schoolName;
        students = new ArrayList<>();
    }

    // Aggregation: add existing student
    public void addStudent(Student student) {
        students.add(student);
    }

    // Display students in school
    public void showStudents() {
        System.out.println("School Name: " + schoolName);
        System.out.println("Students List:");

        for (Student student : students) {
            System.out.println("- " + student.getStudentName());
        }
        System.out.println();
    }
}
