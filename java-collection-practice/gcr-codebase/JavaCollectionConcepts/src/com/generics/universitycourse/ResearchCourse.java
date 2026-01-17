package com.generics.universitycourse;

public class ResearchCourse extends CourseType {

 private String researchArea;

 public ResearchCourse(String courseName, int credits, String researchArea) {
     super(courseName, credits);
     this.researchArea = researchArea;
 }

 @Override
 public String evaluationMethod() {
     return "Research Based (Area: " + researchArea + ")";
 }
}
