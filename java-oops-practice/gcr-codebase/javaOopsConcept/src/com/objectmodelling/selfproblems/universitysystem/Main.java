package com.objectmodelling.universitysystem;

public class Main {

    public static void main(String[] args) {

        // Students
        Student s1 = new Student("Aarav");
        Student s2 = new Student("Meera");

        // Professors
        Professor p1 = new Professor("Dr. Sharma");
        Professor p2 = new Professor("Dr. Iyer");

        // Courses
        Course c1 = new Course("Data Structures");
        Course c2 = new Course("Operating Systems");

        // Assign professors
        p1.assignProfessor(c1);
        p2.assignProfessor(c2);

        // Enroll students
        s1.enrollCourse(c1);
        s1.enrollCourse(c2);

        s2.enrollCourse(c1);

        // Display details
        s1.viewCourses();
        s2.viewCourses();

        p1.viewCourses();
        p2.viewCourses();

        c1.showCourseDetails();
        c2.showCourseDetails();
    }
}
