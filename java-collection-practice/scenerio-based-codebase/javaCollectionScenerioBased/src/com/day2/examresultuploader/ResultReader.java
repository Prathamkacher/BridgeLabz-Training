package com.day_2.examresultuploader;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class ResultReader {

    private static final Pattern LINE_PATTERN =
            Pattern.compile("\\d+,\\w+,\\w+,\\d+");

    public static <T> List<ExamRecord<T>> readFile(String path, T examType)
            throws InvalidFormatException {

        List<ExamRecord<T>> records = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            br.readLine(); // skip header

            while ((line = br.readLine()) != null) {

                if (!LINE_PATTERN.matcher(line).matches())
                    throw new InvalidFormatException("Invalid line: " + line);

                String[] parts = line.split(",");

                records.add(new ExamRecord<>(
                        parts[0], parts[1], parts[2],
                        Integer.parseInt(parts[3]), examType));
            }
        } catch (IOException e) {
            System.out.println("File read error");
        }
        return records;
    }
}
