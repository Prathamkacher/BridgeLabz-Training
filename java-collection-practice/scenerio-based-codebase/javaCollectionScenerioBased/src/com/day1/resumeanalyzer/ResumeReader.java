package com.day_1.resumeanalyzer;

import java.io.*;
import java.nio.file.*;

public class ResumeReader {

    public static String readFile(File file) throws Exception {
        String name = file.getName().toLowerCase();

        if (name.endsWith(".txt")) {
            return new String(Files.readAllBytes(file.toPath()));
        } 
        else if (name.endsWith(".pdf")) {
            // Simple approach (PDF as text stream)
            // In real apps, libraries like Apache PDFBox are used
            return new String(Files.readAllBytes(file.toPath()));
        } 
        else {
            throw new Exception("Unsupported file format: " + file.getName());
        }
    }
}
