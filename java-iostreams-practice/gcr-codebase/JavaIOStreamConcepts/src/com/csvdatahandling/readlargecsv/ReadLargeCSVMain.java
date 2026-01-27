package com.csvdatahandling.readlargecsv;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadLargeCSVMain {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader("large_students.csv"));
        String line;

        int batchSize = 100;
        int count = 0;
        int totalProcessed = 0;

        br.readLine();

        while ((line = br.readLine()) != null) {
            count++;
            totalProcessed++;


            if (count == batchSize) {
                System.out.println("Processed records: " + totalProcessed);
                count = 0; // reset batch counter
            }
        }

        // for remaining lines (<100)
        if (count > 0) {
            System.out.println("Processed records: " + totalProcessed);
        }

        br.close();
    }
}
