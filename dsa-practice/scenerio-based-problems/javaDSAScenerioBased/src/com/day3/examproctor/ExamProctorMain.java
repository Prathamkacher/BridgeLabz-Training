/*
 * 11. ExamProctor – Online Exam Review System (Stack + HashMap +
Functions)
Story: During an online exam, each student’s question navigation is recorded using a Stack
(last visited question). Answers are stored in a HashMap: questionID → answer.
A function auto-calculates the score once the student submits.
Requirements:
● Track navigation with stack.
● Store answers in a map.
● Evaluate using functions for scoring logic.
 */

package com.day3.examproctor;

public class ExamProctorMain {

    public static void main(String[] args) {

        ExamProctor exam = new ExamProctor();

        // Navigation tracking
        exam.visitQuestion(1);
        exam.visitQuestion(2);
        exam.visitQuestion(3);
        exam.visitQuestion(2);
        exam.visitQuestion(4);

        // Submitting answers
        exam.submitAnswer(1, "A");
        exam.submitAnswer(2, "B");
        exam.submitAnswer(3, "A"); // wrong
        exam.submitAnswer(4, "D");

        // Submit exam
        exam.submitExam();
    }
}
