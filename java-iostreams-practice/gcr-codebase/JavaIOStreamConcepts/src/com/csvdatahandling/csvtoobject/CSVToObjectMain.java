package com.csvdatahandling.csvtoobject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class CSVToObjectMain {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader("P:\\BridgeLabz-Training\\java-iostreams-practice\\gcr-codebase\\JavaIOStreamConcepts\\src\\com\\csvdatahandling\\csvtoobject\\students.csv"));
        List<Student> list = new ArrayList<>();
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

            list.add(s);
        }

        br.close();

        // print all student objects
        for (Student s : list) {
            s.print();
        }
    }
}
