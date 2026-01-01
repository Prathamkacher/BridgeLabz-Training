package com.objectmodelling.universitysystem;


import java.util.ArrayList;

public class Course {

    private String courseName;
    private Professor professor;
    private ArrayList<Student> students;

    public Course(String courseName) {
        this.courseName = courseName;
        students = new ArrayList<>();
    }

    // Aggregation: add student
    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    // Association: assign professor
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public String getCourseName() {
        return courseName;
    }

    // View course details
    public void showCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Professor : " +
                (professor != null ? professor.getProfessorName() : "Not Assigned"));

        System.out.println("Students Enrolled:");
        for (Student student : students) {
            System.out.println("- " + student.getStudentName());
        }
        System.out.println();
    }
}
