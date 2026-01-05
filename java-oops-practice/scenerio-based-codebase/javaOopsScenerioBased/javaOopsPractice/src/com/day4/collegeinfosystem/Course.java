package com.day4.collegeinfosystem;

import java.util.*;

class Course {
    private String courseName;
    private Faculty faculty;
    private ArrayList<Student> students;

    Course(String courseName, Faculty faculty) {
        this.courseName = courseName;
        this.faculty = faculty;
        students = new ArrayList<>();
    }

    void addStudent(Student s) {
        students.add(s);
    }

    void removeStudent(Student s) {
        students.remove(s);
    }

    void printCourseDetails() {
        System.out.println("Course: " + courseName);
        System.out.println("Faculty: " + faculty.name);
        System.out.println("Total Students: " + students.size());
    }
}
