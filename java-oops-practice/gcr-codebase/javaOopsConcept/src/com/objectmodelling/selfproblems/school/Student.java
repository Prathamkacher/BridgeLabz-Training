package com.objectmodelling.school;

import java.util.ArrayList;

public class Student {

    private String studentName;
    private ArrayList<Course> courses;

    // Constructor
    public Student(String studentName) {
        this.studentName = studentName;
        courses = new ArrayList<>();
    }

    // Enroll student in course (association)
    public void enrollCourse(Course course) {
        courses.add(course);
        course.addStudent(this);
    }

    // View enrolled courses
    public void viewCourses() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Enrolled Courses:");

        for (Course course : courses) {
            System.out.println("- " + course.getCourseName());
        }
        System.out.println();
    }

    public String getStudentName() {
        return studentName;
    }
}
