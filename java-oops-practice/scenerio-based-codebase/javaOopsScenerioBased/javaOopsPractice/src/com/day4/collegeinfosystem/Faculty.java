package com.day4.collegeinfosystem;

class Faculty extends Person {

    private String department;

    Faculty(int id, String name, String email, String department) {
        super(id, name, email);
        this.department = department;
    }

    @Override
    void printDetails() {
        super.printDetails();
        System.out.println("Role: Faculty");
        System.out.println("Department: " + department);
    }
}
