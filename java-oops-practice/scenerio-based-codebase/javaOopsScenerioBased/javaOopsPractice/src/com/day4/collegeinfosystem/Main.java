/*
 * 8. "CampusConnect – College Information System"
Story: Your university launches CampusConnect, a portal to manage students, teachers, and
courses. You're developing the academic module.
Requirements:
● Person (base class): common fields like name, email, id.
● Student and Faculty extend Person (use inheritance).
● ICourseActions interface with methods like enrollCourse() and dropCourse().
● Course class has a list of students and a faculty assigned.
● Use constructors to initialize students and courses.
● Use access modifiers: student grades must be private.
● Use operators to calculate GPA based on grades.
● Polymorphism: printDetails() works differently for Student and Faculty.
 */

package com.day4.collegeinfosystem;

public class Main {

    public static void main(String[] args) {

        Faculty f1 = new Faculty(101, "Vishal Bhakare", "vishal@bridglebz.com", "Computer Science");

        Student s1 = new Student(1, "Krishna", "krishnagangrape@student.com");
        Student s2 = new Student(2, "Sana", "sana@student.com");

        s1.addGrade(8);
        s1.addGrade(9);

        s2.addGrade(7);
        s2.addGrade(8);

        Course javaCourse = new Course("Java Programming", f1);

        s1.enrollCourse(javaCourse);
        s2.enrollCourse(javaCourse);

        System.out.println("----- Student Details -----");
        s1.printDetails();
        System.out.println();
        s2.printDetails();

        System.out.println("\n----- Faculty Details -----");
        f1.printDetails();

        System.out.println("\n----- Course Details -----");
        javaCourse.printCourseDetails();
    }
}