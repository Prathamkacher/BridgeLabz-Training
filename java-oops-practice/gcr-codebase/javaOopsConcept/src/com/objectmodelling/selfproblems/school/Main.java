package com.objectmodelling.school;

public class Main {

    public static void main(String[] args) {

        // School
        School school = new School("Green Valley School");

        // Students
        Student s1 = new Student("Aarav");
        Student s2 = new Student("Meera");

        // Courses
        Course math = new Course("Mathematics");
        Course science = new Course("Science");

        // Aggregation
        school.addStudent(s1);
        school.addStudent(s2);

        // Association (many-to-many)
        s1.enrollCourse(math);
        s1.enrollCourse(science);

        s2.enrollCourse(science);

        // Display outputs
        school.showStudents();

        s1.viewCourses();
        s2.viewCourses();

        math.viewStudents();
        science.viewStudents();
    }
}
