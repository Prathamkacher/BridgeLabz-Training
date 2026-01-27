package com.day_2.examresultuploader;

import java.util.*;

public class ExamResultUploaderApp {

    public static void main(String[] args) {

        try {
            List<ExamRecord<String>> records =
                    ResultReader.readFile("marks.csv", "FinalExam");

            Map<String, List<Integer>> marks =
                    ResultProcessor.subjectWiseMarks(records);

            System.out.println("Subject-wise Marks:");
            marks.forEach((s, m) -> System.out.println(s + " -> " + m));

            ResultProcessor.topScorerPerSubject(records);

        } catch (InvalidFormatException e) {
            System.out.println("Format Error: " + e.getMessage());
        }
    }
}
