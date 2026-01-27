package com.csvdatahandling.detectduplicates;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Set;

public class DetectDuplicatesMain {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader("P:\\BridgeLabz-Training\\java-iostreams-practice\\gcr-codebase\\JavaIOStreamConcepts\\src\\com\\csvdatahandling\\detectduplicates\\students.csv"));
        Set<String> seenIds = new HashSet<>();
        String line;

        br.readLine(); // skip header

        System.out.println("Duplicate Records:");

        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");
            String id = data[0];

            if (seenIds.contains(id)) {
                System.out.println(line);
            } else {
                seenIds.add(id);
            }
        }

        br.close();
    }
}
