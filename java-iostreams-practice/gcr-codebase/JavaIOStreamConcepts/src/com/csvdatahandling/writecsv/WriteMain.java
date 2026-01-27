package com.csvdatahandling.writecsv;

import java.io.FileWriter;

public class WriteMain {
    public static void main(String[] args) throws Exception {

        FileWriter fw = new FileWriter("P:\\BridgeLabz-Training\\java-iostreams-practice\\gcr-codebase\\JavaIOStreamConcepts\\src\\com\\csvdatahandling\\writecsv\\employees.csv");

        fw.write("ID,Name,Department,Salary\n");

        Employee[] emp = {
            new Employee(1, "Amit", "IT", 50000),
            new Employee(2, "Neha", "HR", 45000),
            new Employee(3, "Rahul", "Finance", 55000),
            new Employee(4, "Sneha", "Sales", 48000),
            new Employee(5, "Karan", "IT", 60000)
        };

        for (Employee e : emp) {
            fw.write(e.toCSV() + "\n");
        }

        fw.close();

        System.out.println("CSV file created and data written successfully.");
    }
}
