package com.ioandstringsandsearching.filereader.problem1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileRead{

    public static void readFileLineByLine(String filePath) {

        try (FileReader fr = new FileReader(filePath);
             BufferedReader br = new BufferedReader(fr)) {

            String line;

            // Read file line by line
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
