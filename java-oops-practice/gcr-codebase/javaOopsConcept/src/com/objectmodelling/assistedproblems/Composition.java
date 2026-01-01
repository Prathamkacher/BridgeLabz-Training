package com.objectmodelling.assistedproblems;

public class Composition{
    public static void main(String[] args) {

        Company company = new Company("TechNova");

        Department dev = new Department("Development");
        dev.addEmployee(101, "Prahtam");
        dev.addEmployee(102, "Riya");

        Department hr = new Department("HR");
        hr.addEmployee(201, "Aman");

        company.addDepartment(dev);
        company.addDepartment(hr);

        company.displayCompany();

        // Deleting company reference
        company = null;

        // Now departments and employees are unreachable → eligible for GC
    }
}
