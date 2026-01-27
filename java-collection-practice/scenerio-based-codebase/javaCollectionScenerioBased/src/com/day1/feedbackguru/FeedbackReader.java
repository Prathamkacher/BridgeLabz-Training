package com.day_1.feedbackguru;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class FeedbackReader {

    public static List<String> readFeedbackFiles(String folderPath) {
        List<String> lines = new ArrayList<>();
        File folder = new File(folderPath);

        if (!folder.exists() || !folder.isDirectory()) {
            System.out.println("Invalid folder path");
            return lines;
        }

        for (File file : folder.listFiles()) {
            if (file.getName().endsWith(".txt")) {
                try {
                    lines.addAll(Files.readAllLines(file.toPath()));
                } catch (Exception e) {
                    System.out.println("Error reading " + file.getName());
                }
            }
        }
        return lines;
    }
}
