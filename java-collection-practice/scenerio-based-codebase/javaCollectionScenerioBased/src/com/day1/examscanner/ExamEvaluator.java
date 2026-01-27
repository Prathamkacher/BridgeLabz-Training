package com.day_1.examscanner;

import java.util.*;

public class ExamEvaluator {

    public static <T extends AnswerSheet<String>> Map<String, Integer>
    evaluate(List<T> sheets, List<String> answerKey) {

        Map<String, Integer> scores = new HashMap<>();

        for (T sheet : sheets) {
            int score = 0;

            for (int i = 0; i < answerKey.size() && i < sheet.answers.size(); i++) {
                if (sheet.answers.get(i).equalsIgnoreCase(answerKey.get(i))) {
                    score++;
                }
            }
            scores.put(sheet.studentName, score);
        }
        return scores;
    }

    public static void printRanked(Map<String, Integer> scores) {
        PriorityQueue<Map.Entry<String, Integer>> pq =
                new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

        pq.addAll(scores.entrySet());

        System.out.println("\n=== Ranked Results ===");
        while (!pq.isEmpty()) {
            Map.Entry<String, Integer> e = pq.poll();
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }
}
