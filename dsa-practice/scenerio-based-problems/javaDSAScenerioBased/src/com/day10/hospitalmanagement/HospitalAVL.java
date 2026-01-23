package com.day10.hospitalmanagement;

public class HospitalAVL {

    private PatientNode root;

    int height(PatientNode n) {
        return n == null ? 0 : n.height;
    }

    int getBalance(PatientNode n) {
        return n == null ? 0 : height(n.left) - height(n.right);
    }

    // Right Rotation
    PatientNode rightRotate(PatientNode y) {
        PatientNode x = y.left;
        PatientNode T2 = x.right;

        x.right = y;
        y.left = T2;

        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x;
    }

    // Left Rotation
    PatientNode leftRotate(PatientNode x) {
        PatientNode y = x.right;
        PatientNode T2 = y.left;

        y.left = x;
        x.right = T2;

        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y;
    }

    // Scenario 1: Patient Registration
    public void register(int id, String name, int time) {
        root = insertRec(root, id, name, time);
    }

    private PatientNode insertRec(PatientNode node, int id, String name, int time) {

        if (node == null)
            return new PatientNode(id, name, time);

        if (time < node.checkInTime)
            node.left = insertRec(node.left, id, name, time);
        else
            node.right = insertRec(node.right, id, name, time);

        node.height = 1 + Math.max(height(node.left), height(node.right));

        int balance = getBalance(node);

        // Balancing cases
        if (balance > 1 && time < node.left.checkInTime)
            return rightRotate(node);

        if (balance < -1 && time > node.right.checkInTime)
            return leftRotate(node);

        if (balance > 1 && time > node.left.checkInTime) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        if (balance < -1 && time < node.right.checkInTime) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    // Scenario 2: Discharge Patient
    public void discharge(int time) {
        root = deleteRec(root, time);
    }

    private PatientNode deleteRec(PatientNode root, int time) {
        if (root == null) return root;

        if (time < root.checkInTime)
            root.left = deleteRec(root.left, time);
        else if (time > root.checkInTime)
            root.right = deleteRec(root.right, time);
        else {
            if (root.left == null || root.right == null)
                root = (root.left != null) ? root.left : root.right;
            else {
                PatientNode temp = getMin(root.right);
                root.checkInTime = temp.checkInTime;
                root.name = temp.name;
                root.patientId = temp.patientId;
                root.right = deleteRec(root.right, temp.checkInTime);
            }
        }

        if (root == null) return root;

        root.height = 1 + Math.max(height(root.left), height(root.right));

        int balance = getBalance(root);

        // Rebalance
        if (balance > 1 && getBalance(root.left) >= 0)
            return rightRotate(root);

        if (balance > 1 && getBalance(root.left) < 0) {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }

        if (balance < -1 && getBalance(root.right) <= 0)
            return leftRotate(root);

        if (balance < -1 && getBalance(root.right) > 0) {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }

        return root;
    }

    private PatientNode getMin(PatientNode node) {
        while (node.left != null)
            node = node.left;
        return node;
    }

    // Scenario 3: Display by Arrival Time
    public void displayPatients() {
        System.out.println("\nPatients by Arrival Time:");
        inorder(root);
    }

    private void inorder(PatientNode node) {
        if (node != null) {
            inorder(node.left);
            System.out.println(node.name + " (ID: " + node.patientId + ") at " + node.checkInTime);
            inorder(node.right);
        }
    }
}
