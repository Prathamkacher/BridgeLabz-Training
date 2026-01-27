package com.day_1.coderepocleaner;

import java.nio.file.*;
import java.util.*;
import java.util.stream.*;

public class CodeRepoCleanerApp {

    public static void main(String[] args) {
        try {
            String root = "sourceFiles";

            List<Path> javaFiles = JavaFileScanner.scanJavaFiles(root);

            // Stream filtering by size (< 1MB)
            javaFiles = javaFiles.stream()
                    .filter(p -> {
                        try {
                            return Files.size(p) < 1_000_000;
                        } catch (Exception e) {
                            return false;
                        }
                    })	
                    .collect(Collectors.toList());

            Map<FileType, List<Path>> categorized = new HashMap<>();
            for (FileType t : FileType.values()) {
                categorized.put(t, new ArrayList<>());
            }

            for (Path file : javaFiles) {
                FileType type = CodeAnalyzer.analyzeFile(file);
                categorized.get(type).add(file);
            }

            FileOrganizer.organize(categorized, "organized");

            System.out.println("Cleaning complete!");
            categorized.forEach((k, v) ->
                    System.out.println(k + ": " + v.size() + " files"));

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
