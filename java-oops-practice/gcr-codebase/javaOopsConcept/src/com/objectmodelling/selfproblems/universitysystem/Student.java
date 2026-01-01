package com.objectmodelling.universitysystem;

import java.util.ArrayList;

public class Student {

    private String studentName;
    private ArrayList<Course> courses;

    public Student(String studentName) {
        this.studentName = studentName;
        courses = new ArrayList<>();
    }

    // Communication: student enrolls in course
    public void enrollCourse(Course course) {
        courses.add(course);
        course.addStudent(this);
    }

    public String getStudentName() {
        return studentName;
    }

    // View enrolled courses
    public void viewCourses() {
        System.out.println("Student: " + studentName);
        System.out.println("Enrolled Courses:");
        for (Course course : courses) {
            System.out.println("- " + course.getCourseName());
        }
        System.out.println();
    }
}
