package com.day_1.resumeanalyzer;

import java.io.File;
import java.util.*;

public class ResumeAnalyzer {

    public static void main(String[] args) {
        String folderPath = "resumes"; // folder containing resumes
        File folder = new File(folderPath);

        Map<String, ResumeData> resumeMap = new HashMap<>();
        List<ResumeData> resumeList = new ArrayList<>();

        if (!folder.exists() || !folder.isDirectory()) {
            System.out.println("Invalid folder path");
            return;
        }

        for (File file : folder.listFiles()) {
            try {
                String content = ResumeReader.readFile(file);
                ResumeData data = ResumeParser.parse(content);

                resumeMap.put(data.email, data);
                resumeList.add(data);

            } catch (Exception e) {
                System.out.println("Skipping file: " + file.getName() +
                                   " | Reason: " + e.getMessage());
            }
        }

        // Sort by keyword match count (descending)
        resumeList.sort((a, b) -> b.keywordCount - a.keywordCount);

        System.out.println("\n=== Sorted Candidates by Skill Match ===");
        for (ResumeData r : resumeList) {
            System.out.println(r);
        }
    }
}
