package com.inheritance.hierarchicalinheritance.schoolsystem;

public class SchoolMain {
    public static void main(String[] args) {

        Person t = new Teacher("Mr. Sharma", 40, "Mathematics");
        Person s = new Student("Aman", 16, "10th Grade");
        Person st = new Staff("Ravi", 35, "Administration");

        t.displayDetails();
        ((Teacher) t).displayRole();
        System.out.println();

        s.displayDetails();
        ((Student) s).displayRole();
        System.out.println();

        st.displayDetails();
        ((Staff) st).displayRole();
    }
}
