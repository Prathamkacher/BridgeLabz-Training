package com.objectmodelling.university;


public class Main {

    public static void main(String[] args) {

        // Faculty objects (independent)
        Faculty f1 = new Faculty("Dr. Sharma", "Computer Science");
        Faculty f2 = new Faculty("Dr. Mehta", "Mathematics");

        // University object
        University university = new University("National Technical University");

        // Composition
        university.addDepartment("Engineering");
        university.addDepartment("Science");

        // Aggregation
        university.addFaculty(f1);
        university.addFaculty(f2);

        // Display details
        university.showUniversityDetails();

        // Delete university
        university.deleteUniversity();

        // Faculty still exists
        System.out.println("\nFaculty still exists independently:");
        f1.showFacultyDetails();
        f2.showFacultyDetails();
    }
}
              