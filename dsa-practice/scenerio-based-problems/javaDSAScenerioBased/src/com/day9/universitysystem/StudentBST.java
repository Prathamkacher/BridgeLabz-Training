package com.day9.universitysystem;

public class StudentBST {

    private StudentNode root;

    // INSERT
    public void insert(int roll, String name) {
        root = insertRec(root, roll, name);
    }

    private StudentNode insertRec(StudentNode root, int roll, String name) {
        if (root == null)
            return new StudentNode(roll, name);

        if (roll < root.roll)
            root.left = insertRec(root.left, roll, name);
        else if (roll > root.roll)
            root.right = insertRec(root.right, roll, name);

        return root;
    }

    // SEARCH
    public void search(int roll) {
        StudentNode result = searchRec(root, roll);
        if (result != null)
            System.out.println("Found: " + result.roll + " - " + result.name);
        else
            System.out.println("Student not found");
    }

    private StudentNode searchRec(StudentNode root, int roll) {
        if (root == null || root.roll == roll)
            return root;

        if (roll < root.roll)
            return searchRec(root.left, roll);

        return searchRec(root.right, roll);
    }

    // DELETE
    public void delete(int roll) {
        root = deleteRec(root, roll);
    }

    private StudentNode deleteRec(StudentNode root, int roll) {
        if (root == null) return null;

        if (roll < root.roll)
            root.left = deleteRec(root.left, roll);
        else if (roll > root.roll)
            root.right = deleteRec(root.right, roll);
        else {
            // Node with one child or no child
            if (root.left == null) return root.right;
            if (root.right == null) return root.left;

            // Node with two children
            root.roll = minValue(root.right);
            root.right = deleteRec(root.right, root.roll);
        }
        return root;
    }

    private int minValue(StudentNode root) {
        while (root.left != null)
            root = root.left;
        return root.roll;
    }

    // DISPLAY SORTED (Inorder)
    public void displaySorted() {
        System.out.print("Sorted Roll Numbers: ");
        inorder(root);
        System.out.println();
    }

    private void inorder(StudentNode root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.roll + " ");
            inorder(root.right);
        }
    }
}
