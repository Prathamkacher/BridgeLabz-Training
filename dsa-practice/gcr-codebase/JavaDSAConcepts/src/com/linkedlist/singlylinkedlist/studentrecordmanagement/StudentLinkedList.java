package com.linkedlist.singlylinkedlist.studentrecordmanagement;

public class StudentLinkedList {

    private StudentNode head;

    // 1. Add at Beginning
    public void addAtBeginning(int rollNo, String name, int age, char grade) {
        StudentNode newNode = new StudentNode(rollNo, name, age, grade);
        newNode.next = head;
        head = newNode;
    }

    // 2. Add at End
    public void addAtEnd(int rollNo, String name, int age, char grade) {
        StudentNode newNode = new StudentNode(rollNo, name, age, grade);

        if (head == null) {
            head = newNode;
            return;
        }

        StudentNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // 3. Add at Specific Position (1-based index)
    public void addAtPosition(int position, int rollNo, String name, int age, char grade) {
        if (position <= 1) {
            addAtBeginning(rollNo, name, age, grade);
            return;
        }

        StudentNode newNode = new StudentNode(rollNo, name, age, grade);
        StudentNode temp = head;

        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid position");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // 4. Delete by Roll Number
    public void deleteByRollNo(int rollNo) {
        if (head == null) return;

        if (head.rollNo == rollNo) {
            head = head.next;
            return;
        }

        StudentNode temp = head;
        while (temp.next != null && temp.next.rollNo != rollNo) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
        } else {
            System.out.println("Student not found");
        }
    }

    // 5. Search by Roll Number
    public void searchByRollNo(int rollNo) {
        StudentNode temp = head;

        while (temp != null) {
            if (temp.rollNo == rollNo) {
                System.out.println("Found: " + temp.name + ", Grade: " + temp.grade);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found");
    }

    // 6. Update Grade
    public void updateGrade(int rollNo, char newGrade) {
        StudentNode temp = head;

        while (temp != null) {
            if (temp.rollNo == rollNo) {
                temp.grade = newGrade;
                System.out.println("Grade updated");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found");
    }

    // 7. Display All Records
    public void display() {
        if (head == null) {
            System.out.println("No records found");
            return;
        }

        StudentNode temp = head;
        while (temp != null) {
            System.out.println(
                "Roll: " + temp.rollNo +
                ", Name: " + temp.name +
                ", Age: " + temp.age +
                ", Grade: " + temp.grade
            );
            temp = temp.next;
        }
    }
}
