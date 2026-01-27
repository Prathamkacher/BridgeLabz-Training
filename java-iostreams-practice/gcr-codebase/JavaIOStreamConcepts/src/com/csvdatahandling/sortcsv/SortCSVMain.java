package com.csvdatahandling.sortcsv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;

public class SortCSVMain {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader("P:\\BridgeLabz-Training\\java-iostreams-practice\\gcr-codebase\\JavaIOStreamConcepts\\src\\com\\csvdatahandling\\sortcsv\\employees.csv"));
        ArrayList<Employee> list = new ArrayList<>();
        String line;

        br.readLine(); // skip header

        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");

            list.add(new Employee(
                Integer.parseInt(data[0]),
                data[1],
                data[2],
                Integer.parseInt(data[3])
            ));
        }

        br.close();

        // sort by salary descending
        Collections.sort(list, (a, b) -> b.salary - a.salary);

        System.out.println("Top 5 Highest Paid Employees:");

        for (int i = 0; i < 5 && i < list.size(); i++) {
            list.get(i).print();
        }
    }
}
