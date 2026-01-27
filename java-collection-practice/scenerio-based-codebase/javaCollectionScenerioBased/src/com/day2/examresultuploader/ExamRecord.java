package com.day_2.examresultuploader;

public class ExamRecord<T> {
    String rollNo;
    String name;
    String subject;
    int marks;
    T examType; // MidTerm, Final, Internal

    public ExamRecord(String rollNo, String name, String subject, int marks, T examType) {
        this.rollNo = rollNo;
        this.name = name;
        this.subject = subject;
        this.marks = marks;
        this.examType = examType;
    }
}
