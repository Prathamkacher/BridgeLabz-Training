package com.csvdatahandling.generatereport;

import java.io.FileWriter;

public class GenerateReportMain {
    public static void main(String[] args) throws Exception {

        Employee[] employees = {
            new Employee(1, "Amit", "IT", 50000),
            new Employee(2, "Neha", "HR", 45000),
            new Employee(3, "Rahul", "Finance", 55000),
            new Employee(4, "Sneha", "Sales", 48000)
        };

        FileWriter fw = new FileWriter("P:\\BridgeLabz-Training\\java-iostreams-practice\\gcr-codebase\\JavaIOStreamConcepts\\src\\com\\csvdatahandling\\generatereport\\employee_report.csv");

        fw.write("Employee ID,Name,Department,Salary\n");

        for (Employee e : employees) {
            fw.write(
                e.id + "," +
                e.name + "," +
                e.department + "," +
                e.salary + "\n"
            );
        }

        fw.close();

        System.out.println("CSV report generated successfully.");
    }
}
