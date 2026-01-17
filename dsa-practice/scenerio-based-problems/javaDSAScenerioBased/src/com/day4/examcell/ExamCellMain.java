/*
 * 5. ExamCell – Student Rank Generator (Merge Sort)
Story: An online exam system collects scores from multiple test centers. To publish a
state-level rank list, student scores are merged and sorted using Merge Sort, ensuring
performance and accuracy.
Key Concepts:
● Merging pre-sorted center-wise scores
● Sorting across centers
● High efficiency for big data
 */

package com.day4.examcell;

public class ExamCellMain {

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

        ExamCell.mergeSort(students, 0, students.length - 1);

        System.out.println("\nState-Level Rank List:");
        int rank = 1;
        for (Student s : students) {
            System.out.println(rank++ + ". " + s);
        }
    }
}
