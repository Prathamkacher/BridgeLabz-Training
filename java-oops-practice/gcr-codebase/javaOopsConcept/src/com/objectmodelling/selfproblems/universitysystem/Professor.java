package com.objectmodelling.universitysystem;

import java.util.ArrayList;

public class Professor {

    private String professorName;
    private ArrayList<Course> courses;

    public Professor(String professorName) {
        this.professorName = professorName;
        courses = new ArrayList<>();
    }

    // Communication: professor assigned to course
    public void assignProfessor(Course course) {
        courses.add(course);
        course.setProfessor(this);
    }

    public String getProfessorName() {
        return professorName;
    }

    // View courses taught
    public void viewCourses() {
        System.out.println("Professor: " + professorName);
        System.out.println("Teaching Courses:");
        for (Course course : courses) {
            System.out.println("- " + course.getCourseName());
        }
        System.out.println();
    }
}
