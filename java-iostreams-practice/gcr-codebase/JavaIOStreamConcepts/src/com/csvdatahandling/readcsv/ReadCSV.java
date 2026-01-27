package com.csvdatahandling.readcsv;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadCSV {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader("P:\\BridgeLabz-Training\\java-iostreams-practice\\gcr-codebase\\JavaIOStreamConcepts\\src\\com\\csvdatahandling\\readcsv\\students.csv"));
        String line;

        br.readLine();

        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");

            Student s = new Student(
                Integer.parseInt(data[0]),
                data[1],
                Integer.parseInt(data[2]),
                Integer.parseInt(data[3])
            );

            s.print();
        }

        br.close();
    }
}
