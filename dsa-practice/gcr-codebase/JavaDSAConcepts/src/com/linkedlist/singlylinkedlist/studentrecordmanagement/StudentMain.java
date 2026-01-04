package com.linkedlist.singlylinkedlist.studentrecordmanagement;

public class StudentMain {

    public static void main(String[] args) {

        StudentLinkedList list = new StudentLinkedList();

        list.addAtBeginning(1, "Aman", 20, 'A');
        list.addAtEnd(2, "Ravi", 21, 'B');
        list.addAtPosition(2, 3, "Aryaman", 22, 'A');

        list.display();

        list.searchByRollNo(2);
        list.updateGrade(2, 'A');

        list.deleteByRollNo(1);

        System.out.println("\nAfter Deletion:");
        list.display();
    }
}
