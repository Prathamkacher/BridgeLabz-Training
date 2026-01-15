package com.day3.examproctor;

import java.util.*;

public class ExamProctor {

    private Stack<Integer> navigation = new Stack<>();
    private HashMap<Integer, String> answers = new HashMap<>();

    // Answer key (correct answers)
    private HashMap<Integer, String> answerKey = new HashMap<>();

    public ExamProctor() {
        // Predefined correct answers
        answerKey.put(1, "A");
        answerKey.put(2, "B");
        answerKey.put(3, "C");
        answerKey.put(4, "D");
    }

    // Track question navigation
    public void visitQuestion(int qId) {
        navigation.push(qId);
        System.out.println("Visited Question: " + qId);
    }

    // Store answer
    public void submitAnswer(int qId, String answer) {
        answers.put(qId, answer);
        System.out.println("Answer saved for Q" + qId + ": " + answer);
    }

    // Function to evaluate score
    public void submitExam() {
        int score = 0;

        for (int qId : answerKey.keySet()) {
            if (answers.containsKey(qId) &&
                answers.get(qId).equals(answerKey.get(qId))) {
                score++;
            }
        }

        System.out.println("\nExam Submitted!");
        System.out.println("Final Score: " + score + "/" + answerKey.size());

        System.out.println("Last visited question: " +
                (navigation.isEmpty() ? "None" : navigation.peek()));
    }
}