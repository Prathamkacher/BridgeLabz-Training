package com.csvdatahandling.searchrecord;

import java.io.BufferedReader;
import java.io.FileReader;

public class SearchCSVMain {
    public static void main(String[] args) throws Exception {

        String searchName = "Neha";

        BufferedReader br = new BufferedReader(new FileReader("P:\\BridgeLabz-Training\\java-iostreams-practice\\gcr-codebase\\JavaIOStreamConcepts\\src\\com\\csvdatahandling\\searchrecord\\employees.csv"));
        String line;

        br.readLine(); // skip header

        boolean found = false;

        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");

            if (data[1].equalsIgnoreCase(searchName)) {
                Employee e = new Employee(
                    data[1],
                    data[2],
                    Integer.parseInt(data[3])
                );
                e.print();
                found = true;
                break;
            }
        }

        br.close();

        if (!found) {
            System.out.println("Employee not found");
        }
    }
}
