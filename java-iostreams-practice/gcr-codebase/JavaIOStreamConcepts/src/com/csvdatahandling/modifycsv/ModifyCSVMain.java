package com.csvdatahandling.modifycsv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class ModifyCSVMain {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader("P:\\BridgeLabz-Training\\java-iostreams-practice\\gcr-codebase\\JavaIOStreamConcepts\\src\\com\\csvdatahandling\\modifycsv\\employees.csv"));
        FileWriter fw = new FileWriter("P:\\BridgeLabz-Training\\java-iostreams-practice\\gcr-codebase\\JavaIOStreamConcepts\\src\\com\\csvdatahandling\\modifycsv\\updated_employees.csv");

        String line;

        fw.write(br.readLine() + "\n"); // write header

        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");

            int salary = Integer.parseInt(data[3]);

            if (data[2].equalsIgnoreCase("IT")) {
                salary = salary + (salary * 10 / 100);
            }

            Employee e = new Employee(
                Integer.parseInt(data[0]),
                data[1],
                data[2],
                salary
            );

            fw.write(e.toCSV() + "\n");
        }

        br.close();
        fw.close();

        System.out.println("Updated CSV file created successfully.");
    }
}
