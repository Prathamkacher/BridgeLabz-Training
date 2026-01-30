package com.json.generatereport;

import java.util.Arrays;
import java.util.List;

public class DataSource {
    public static List<Employee> getRecords() {
        return Arrays.asList(
                new Employee(1, "Aman", 50000),
                new Employee(2, "Riya", 60000),
                new Employee(3, "Karan", 55000)
        );
    }
}
