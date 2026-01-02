package com.inheritance.multilevelinheritance.educationalcourse;

public class CourseMain {
    public static void main(String[] args) {

        Course c = new PaidOnlineCourse(
            "Java Full Stack",
            120,
            "Coursera",
            true,
            15000,
            20
        );

        c.displayDetails();
    }
}
