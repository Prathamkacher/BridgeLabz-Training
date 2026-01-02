package com.day2.universitycoursesystem;

class Undergraduate extends Student implements Graded {

    Undergraduate(int id, String name) {
        super(id, name);
    }

    @Override
    public void assignGrade(double marks) {
        double gradePoint;

        if (marks >= 90) gradePoint = 10;
        else if (marks >= 80) gradePoint = 9;
        else if (marks >= 70) gradePoint = 8;
        else if (marks >= 60) gradePoint = 7;
        else gradePoint = 0;

        addGradePoint(gradePoint);
    }
}
