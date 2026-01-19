/*
 * 3. EduResults – Rank Sheet Generator (Merge Sort)
Story: An educational board compiles marks of thousands of students from different districts.
Each district submits a sorted list of students by score. The main server needs to merge and
sort all these lists into a final state-wise rank list. Merge Sort ensures efficiency and maintains
stability for duplicate scores.
Concepts Involved:
● Merge Sort
● Merging sorted sublists
● Large datasets with stable sorting

 */

package com.day7.eduresults;

public class EduResultsMain {

    public static void main(String[] args) {

        Student[] students = {
            new Student("Rahul", 95),
            new Student("Anita", 90),
            new Student("Mohan", 85),
            new Student("Priya", 98),
            new Student("Karan", 92),
            new Student("Neha", 88)
        };

        System.out.println("Before Sorting:");
        for (Student s : students)
            System.out.println(s);

        EduResults.mergeSort(students, 0, students.length - 1);

        System.out.println("\nFinal State Rank List:");
        int rank = 1;
        for (Student s : students) {
            System.out.println(rank++ + ". " + s);
        }
    }
}
