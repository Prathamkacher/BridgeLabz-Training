package com.day_2.examresultuploader;

import java.util.*;

public class ResultProcessor {

    public static Map<String, List<Integer>> subjectWiseMarks(List<? extends ExamRecord<?>> records) {
        Map<String, List<Integer>> map = new HashMap<>();

        for (ExamRecord<?> r : records) {
            map.putIfAbsent(r.subject, new ArrayList<>());
            map.get(r.subject).add(r.marks);
        }
        return map;
    }

    public static void topScorerPerSubject(List<? extends ExamRecord<?>> records) {

        Map<String, PriorityQueue<ExamRecord<?>>> subjectMap = new HashMap<>();

        for (ExamRecord<?> r : records) {
            subjectMap.putIfAbsent(r.subject,
                    new PriorityQueue<>((a, b) -> b.marks - a.marks));
            subjectMap.get(r.subject).add(r);
        }

        System.out.println("\n=== Top Scorers ===");
        subjectMap.forEach((subject, pq) -> {
            ExamRecord<?> top = pq.peek();
            System.out.println(subject + " -> " + top.name + " (" + top.marks + ")");
        });
    }
}
