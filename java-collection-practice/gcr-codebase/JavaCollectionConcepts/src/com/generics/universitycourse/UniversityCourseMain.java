package com.generics.universitycourse;

//Main.java
import java.util.Arrays;
import java.util.List;

public class UniversityCourseMain {

 public static void main(String[] args) {

     Course<ExamCourse> math =
             new Course<>("Mathematics",
                     new ExamCourse("Linear Algebra", 4, 70));

     Course<AssignmentCourse> cs =
             new Course<>("Computer Science",
                     new AssignmentCourse("Data Structures", 5, 6));

     Course<ResearchCourse> phd =
             new Course<>("Physics",
                     new ResearchCourse("Quantum Computing", 8, "Quantum Algorithms"));

     System.out.println("---- Course Details ----");
     System.out.println(math.getDetails());
     System.out.println(cs.getDetails());
     System.out.println(phd.getDetails());

     // Wildcard usage
     List<ExamCourse> examCourses = Arrays.asList(
             new ExamCourse("Calculus", 4, 80),
             new ExamCourse("Probability", 3, 60)
     );

     System.out.println("\n---- Exam Courses ----");
     UniversityUtils.displayCourses(examCourses);
 }
}
