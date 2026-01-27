package com.csvdatahandling.filterrecords;

import java.io.BufferedReader;
import java.io.FileReader;

public class FilterCSVMain {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader("P:\\BridgeLabz-Training\\java-iostreams-practice\\gcr-codebase\\JavaIOStreamConcepts\\src\\com\\csvdatahandling\\filterrecords\\students.csv"));
        String line;

        br.readLine(); // skip header

        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");

            int marks = Integer.parseInt(data[3]);

            if (marks > 80) {
                Student s = new Student(
                    Integer.parseInt(data[0]),
                    data[1],
                    Integer.parseInt(data[2]),
                    marks
                );
                s.print();
            }
        }

        br.close();
    }
}
