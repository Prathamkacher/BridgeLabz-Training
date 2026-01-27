package com.day_1.examscanner;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class ExamReader {

    // Valid line: Name,A,B,C,D...
    private static final Pattern LINE_PATTERN =
            Pattern.compile("^[A-Za-z ]+(,[A-D])+$");

    public static List<String[]> readFile(String filePath) {
        List<String[]> records = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = br.readLine()) != null) {
                if (!LINE_PATTERN.matcher(line).matches()) {
                    System.out.println("Invalid format skipped: " + line);
                    continue;
                }
                records.add(line.split(","));
            }
        } catch (Exception e) {
            System.out.println("Error reading file");
        }
        return records;
    }
}
