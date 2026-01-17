package com.generics.universitycourse;

public class ExamCourse extends CourseType {

 private int examWeightage;

 public ExamCourse(String courseName, int credits, int examWeightage) {
     super(courseName, credits);
     this.examWeightage = examWeightage;
 }

 @Override
 public String evaluationMethod() {
     return "Exam Based (" + examWeightage + "% weightage)";
 }
}
