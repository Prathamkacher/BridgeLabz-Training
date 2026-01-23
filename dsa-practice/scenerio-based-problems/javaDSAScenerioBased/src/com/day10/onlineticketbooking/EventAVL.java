package com.day10.onlineticketbooking;

public class EventAVL {

    private EventNode root;

    // Height
    int height(EventNode node) {
        return node == null ? 0 : node.height;
    }

    // Balance factor
    int getBalance(EventNode node) {
        return node == null ? 0 : height(node.left) - height(node.right);
    }

    // Right Rotation
    EventNode rightRotate(EventNode y) {
        EventNode x = y.left;
        EventNode T2 = x.right;

        x.right = y;
        y.left = T2;

        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x;
    }

    // Left Rotation
    EventNode leftRotate(EventNode x) {
        EventNode y = x.right;
        EventNode T2 = y.left;

        y.left = x;
        x.right = T2;

        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y;
    }

    // Scenario 1: Insert Event
    public void insert(int id, String name, int time) {
        root = insertRec(root, id, name, time);
    }

    private EventNode insertRec(EventNode node, int id, String name, int time) {

        if (node == null)
            return new EventNode(id, name, time);

        if (time < node.startTime)
            node.left = insertRec(node.left, id, name, time);
        else
            node.right = insertRec(node.right, id, name, time);

        node.height = 1 + Math.max(height(node.left), height(node.right));

        int balance = getBalance(node);

        // Balancing
        if (balance > 1 && time < node.left.startTime)
            return rightRotate(node);

        if (balance < -1 && time > node.right.startTime)
            return leftRotate(node);

        if (balance > 1 && time > node.left.startTime) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        if (balance < -1 && time < node.right.startTime) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    // Scenario 2: Delete Event
    public void delete(int time) {
        root = deleteRec(root, time);
    }

    private EventNode deleteRec(EventNode root, int time) {
        if (root == null) return root;

        if (time < root.startTime)
            root.left = deleteRec(root.left, time);
        else if (time > root.startTime)
            root.right = deleteRec(root.right, time);
        else {
            if ((root.left == null) || (root.right == null)) {
                root = (root.left != null) ? root.left : root.right;
            } else {
                EventNode temp = getMin(root.right);
                root.startTime = temp.startTime;
                root.eventName = temp.eventName;
                root.eventId = temp.eventId;
                root.right = deleteRec(root.right, temp.startTime);
            }
        }

        if (root == null) return root;

        root.height = Math.max(height(root.left), height(root.right)) + 1;

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

    private EventNode getMin(EventNode node) {
        while (node.left != null)
            node = node.left;
        return node;
    }

    // Scenario 3: Show events in order
    public void displayEvents() {
        System.out.println("\nUpcoming Events:");
        inorder(root);
    }

    private void inorder(EventNode node) {
        if (node != null) {
            inorder(node.left);
            System.out.println(node.eventName + " at " + node.startTime);
            inorder(node.right);
        }
    }
}
