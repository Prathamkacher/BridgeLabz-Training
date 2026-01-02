package com.day2.universitycoursesystem;

class Course {
    private int courseId;
    private String courseName;

    Course(int id, String name) {
        this.courseId = id;
        this.courseName = name;
    }

    public String getCourseName() {
        return courseName;
    }
}
