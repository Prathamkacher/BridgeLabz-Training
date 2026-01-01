package com.objectmodelling.assistedproblems;

import java.util.ArrayList;
import java.util.List;

class Company {
    private String companyName;
    private List<Department> departments;

    Company(String companyName) {
        this.companyName = companyName;
        this.departments = new ArrayList<>();
    }

    void addDepartment(Department dept) {
        departments.add(dept);
    }

    void displayCompany() {
        System.out.println("Company: " + companyName);
        for (Department d : departments) {
            d.displayDepartment();
        }
    }
}
