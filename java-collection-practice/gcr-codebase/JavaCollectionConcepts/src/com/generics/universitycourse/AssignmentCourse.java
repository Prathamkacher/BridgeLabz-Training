package com.generics.universitycourse;

public class AssignmentCourse extends CourseType {

 private int assignmentCount;

 public AssignmentCourse(String courseName, int credits, int assignmentCount) {
     super(courseName, credits);
     this.assignmentCount = assignmentCount;
 }

 @Override
 public String evaluationMethod() {
     return "Assignment Based (" + assignmentCount + " assignments)";
 }
}
