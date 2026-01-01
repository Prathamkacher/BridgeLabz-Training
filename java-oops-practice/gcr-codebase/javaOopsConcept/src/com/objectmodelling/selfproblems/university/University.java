package com.objectmodelling.university;

import java.util.ArrayList;

public class University {

    private String universityName;
    private ArrayList<Department> departments;
    private ArrayList<Faculty> faculties;

    public University(String universityName) {
        this.universityName = universityName;
        departments = new ArrayList<>();
        faculties = new ArrayList<>();
    }

    // Composition: departments created inside university
    public void addDepartment(String departmentName) {
        Department department = new Department(departmentName);
        departments.add(department);
    }

    // Aggregation: faculty added from outside
    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public void showUniversityDetails() {
        System.out.println("University Name: " + universityName);

        System.out.println("\nDepartments:");
        for (Department dept : departments) {
            dept.showDepartment();
        }

        System.out.println("\nFaculties:");
        for (Faculty faculty : faculties) {
            faculty.showFacultyDetails();
        }
    }

    // Composition cleanup
    public void deleteUniversity() {
        departments.clear();
        System.out.println("\nUniversity deleted along with all departments.");
    }
}
