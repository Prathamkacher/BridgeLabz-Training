package com.generics.universitycourse;

import java.util.List;

public class UniversityUtils {

 public static void displayCourses(List<? extends CourseType> courses) {
     for (CourseType course : courses) {
         System.out.println(
             course.getCourseName() +
             " | Credits: " + course.getCredits() +
             " | Evaluation: " + course.evaluationMethod()
         );
     }
 }
}
