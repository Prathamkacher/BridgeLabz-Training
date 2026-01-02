package com.day2.universitycoursesystem;

class Postgraduate extends Student implements Graded {

    Postgraduate(int id, String name, String elective) {
        super(id, name, elective);
    }

    @Override
    public void assignGrade(double marks) {
        if (marks >= 50)
            addGradePoint(8);   // pass
        else
            addGradePoint(0);   // fail
    }
}
