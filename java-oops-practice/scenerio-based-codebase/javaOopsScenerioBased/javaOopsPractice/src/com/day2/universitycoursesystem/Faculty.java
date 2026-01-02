package com.day2.universitycoursesystem;

class Faculty {
    private int facultyId;
    private String name;

    Faculty(int id, String name) {
        this.facultyId = id;
        this.name = name;
    }

    public void assignGrade(Graded student, double marks) {
        student.assignGrade(marks);
    }
}
