package com.generics.universitycourse;

public class Course<T extends CourseType> {

 private String department;
 private T courseType;

 public Course(String department, T courseType) {
     this.department = department;
     this.courseType = courseType;
 }

 public T getCourseType() {
     return courseType;
 }

 public String getDetails() {
     return "Department: " + department +
            ", Course: " + courseType.getCourseName() +
            ", Credits: " + courseType.getCredits() +
            ", Evaluation: " + courseType.evaluationMethod();
 }
}
