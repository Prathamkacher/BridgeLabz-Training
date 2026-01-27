package com.csvdatahandling.mergecsv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;

public class MergeCSVMain {
    public static void main(String[] args) throws Exception {

        HashMap<String, String[]> map = new HashMap<>();

        // Read students2.csv (Marks, Grade)
        BufferedReader br2 = new BufferedReader(new FileReader("P:\\BridgeLabz-Training\\java-iostreams-practice\\gcr-codebase\\JavaIOStreamConcepts\\src\\com\\csvdatahandling\\mergecsv\\students2.csv"));
        br2.readLine(); // skip header

        String line;
        while ((line = br2.readLine()) != null) {
            String[] data = line.split(",");
            map.put(data[0], new String[]{data[1], data[2]});
        }
        br2.close();

        // Read students1.csv and merge
        BufferedReader br1 = new BufferedReader(new FileReader("P:\\BridgeLabz-Training\\java-iostreams-practice\\gcr-codebase\\JavaIOStreamConcepts\\src\\com\\csvdatahandling\\mergecsv\\students1.csv"));
        FileWriter fw = new FileWriter("P:\\BridgeLabz-Training\\java-iostreams-practice\\gcr-codebase\\JavaIOStreamConcepts\\src\\com\\csvdatahandling\\mergecsv\\merged_students.csv");

        fw.write("ID,Name,Age,Marks,Grade\n"); // header
        br1.readLine(); // skip header

        while ((line = br1.readLine()) != null) {
            String[] data = line.split(",");

            String id = data[0];
            String name = data[1];
            String age = data[2];

            String[] marksGrade = map.get(id);

            fw.write(id + "," + name + "," + age + "," +
                     marksGrade[0] + "," + marksGrade[1] + "\n");
        }

        br1.close();
        fw.close();

        System.out.println("CSV files merged successfully.");
    }
}
