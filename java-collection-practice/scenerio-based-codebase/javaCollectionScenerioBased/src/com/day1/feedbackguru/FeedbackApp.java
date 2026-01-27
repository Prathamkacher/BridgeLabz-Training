package com.day_1.feedbackguru;

import java.util.*;

public class FeedbackApp {

    public static void main(String[] args) {

        String folderPath = "feedbacks"; // folder with .txt files

        List<String> lines = FeedbackReader.readFeedbackFiles(folderPath);

        Map<String, List<Feedback<String>>> result =
                FeedbackAnalyzer.analyze(lines, "Service");

        System.out.println("\n=== Feedback Summary ===");

        for (String category : result.keySet()) {
            System.out.println("\n" + category + " Feedback:");
            for (Feedback<String> f : result.get(category)) {
                System.out.println(f);
            }
        }
    }
}
