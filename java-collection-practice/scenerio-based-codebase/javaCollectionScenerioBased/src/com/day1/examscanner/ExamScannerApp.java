package com.day_1.examscanner;

import java.util.*;

public class ExamScannerApp {

    public static void main(String[] args) {

        List<String[]> data = ExamReader.readFile("answers.csv");

        List<MathAnswerSheet> mathSheets = new ArrayList<>();

        for (String[] row : data) {
            String name = row[0];
            List<String> answers = Arrays.asList(Arrays.copyOfRange(row, 1, row.length));
            mathSheets.add(new MathAnswerSheet(name, answers));
        }

        List<String> answerKey = Arrays.asList("A", "B", "C", "D", "A", "B", "C");

        Map<String, Integer> scores =
                ExamEvaluator.evaluate(mathSheets, answerKey);

        ExamEvaluator.printRanked(scores);
    }
}
