package com.objectmodelling.university;


public class Faculty {

    private String facultyName;
    private String specialization;

    public Faculty(String facultyName, String specialization) {
        this.facultyName = facultyName;
        this.specialization = specialization;
    }

    public void showFacultyDetails() {
        System.out.println("Faculty Name  : " + facultyName);
        System.out.println("Specialization: " + specialization);
        System.out.println();
    }
}

