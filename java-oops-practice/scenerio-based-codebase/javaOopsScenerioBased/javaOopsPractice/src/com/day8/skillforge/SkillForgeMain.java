/*
 * 21. "SkillForge – Online Learning Portal"
Story: A startup builds SkillForge, where instructors upload courses and students enroll,
complete, and get certified.
Requirements:
● Course class: title, instructor, rating, modules[].
● User class → Student, Instructor (inheritance).
● Interface ICertifiable with generateCertificate() method.
● Constructors for courses with default or custom module lists.
● Use operators for grading, progress tracking.
● Encapsulation: course rating logic protected.
● Polymorphism: certificate format varies per course level.
● Access Modifiers: internal course reviews are read-only.
 */

package com.day8.skillforge;

public class SkillForgeMain {

    public static void main(String[] args) {

        Instructor instructor = new Instructor(
                "Sonalii",
                "Sonalii@skillforge.com"
        );

        Course course = new Course(
                "Java Fundamentals",
                instructor,
                "Beginner"
        );

        instructor.uploadCourse(course);

        Student student = new Student(
                "Pratham",
                "pratham@gmail.com"
        );

        // Student completes modules
        student.completeModule();
        student.completeModule();
        student.completeModule();

        // Certificate generation (polymorphism)
        student.generateCertificate(course);

        System.out.println("Course Rating: " + course.getRating());
    }
}
