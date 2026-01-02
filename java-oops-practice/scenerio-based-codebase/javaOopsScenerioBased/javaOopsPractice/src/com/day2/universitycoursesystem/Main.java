/*
 3. University Course Enrollment System
Scenario: Students should be able to enroll in courses, and faculty can assign grades.
Concepts Used:
● Class: Student, Course, Faculty, Enrollment
● Constructors: Used to create students with/without elective preferences
● Access Modifiers: private for internal GPA fields, public method to access
transcript
● Interface: Graded with method assignGrade()
● Operators: GPA calculations and comparisons (using +, /, etc.)
● OOP:
○ Encapsulation: Secure handling of grades
○ Inheritance: Undergraduate, Postgraduate extend Student

Scenario-based Problems
○ Abstraction: Interface allows different grading styles
○ Polymorphism: assignGrade() works differently for pass/fail vs. letter grading
 */

package com.day2.universitycoursesystem;

public class Main {
    public static void main(String[] args) {

        Student ug = new Undergraduate(101, "Krishna");
        Student pg = new Postgraduate(201, "Annu", "AI");

        Course java = new Course(1, "Java Programming");

        Faculty faculty = new Faculty(1, "Dr. Rao");

        new Enrollment(ug, java);
        new Enrollment(pg, java);

        faculty.assignGrade((Graded) ug, 85);
        faculty.assignGrade((Graded) pg, 85);

        ug.displayTranscript();
        pg.displayTranscript();
    }
}
