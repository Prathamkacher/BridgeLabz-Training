package com.day_1.examscanner;

import java.util.List;

public class AnswerSheet<T> {
    String studentName;
    List<T> answers;

    public AnswerSheet(String studentName, List<T> answers) {
        this.studentName = studentName;
        this.answers = answers;
    }
}
