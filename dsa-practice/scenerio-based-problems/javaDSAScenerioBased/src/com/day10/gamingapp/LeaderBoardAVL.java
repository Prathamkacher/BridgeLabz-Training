package com.day10.gamingapp;

public class LeaderBoardAVL {

    private PlayerNode root;

    // Height
    int height(PlayerNode n) {
        return (n == null) ? 0 : n.height;
    }

    // Balance factor
    int getBalance(PlayerNode n) {
        return (n == null) ? 0 : height(n.left) - height(n.right);
    }

    // Right rotate
    PlayerNode rightRotate(PlayerNode y) {
        PlayerNode x = y.left;
        PlayerNode T2 = x.right;

        x.right = y;
        y.left = T2;

        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x;
    }

    // Left rotate
    PlayerNode leftRotate(PlayerNode x) {
        PlayerNode y = x.right;
        PlayerNode T2 = y.left;

        y.left = x;
        x.right = T2;

        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y;
    }

    // Scenario 1: Insert / Update
    public void insert(int id, String name, int score) {
        root = insertRec(root, id, name, score);
    }

    private PlayerNode insertRec(PlayerNode node, int id, String name, int score) {

        if (node == null)
            return new PlayerNode(id, name, score);

        if (score > node.score)
            node.right = insertRec(node.right, id, name, score);
        else
            node.left = insertRec(node.left, id, name, score);

        node.height = 1 + Math.max(height(node.left), height(node.right));

        int balance = getBalance(node);

        // Rotations
        if (balance > 1 && score < node.left.score)
            return rightRotate(node);

        if (balance < -1 && score > node.right.score)
            return leftRotate(node);

        if (balance > 1 && score > node.left.score) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        if (balance < -1 && score < node.right.score) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    // Scenario 2: Display Top Players
    public void showTopPlayers(int k) {
        System.out.println("\nTop Players:");
        reverseInorder(root, new int[]{k});
    }

    private void reverseInorder(PlayerNode node, int[] k) {
        if (node == null || k[0] == 0) return;

        reverseInorder(node.right, k);

        if (k[0] > 0) {
            System.out.println(node.name + " - " + node.score);
            k[0]--;
        }

        reverseInorder(node.left, k);
    }

    // Scenario 3: Remove Player (simplified demo)
    public void clearLeaderboard() {
        root = null;
        System.out.println("\nAll players removed.");
    }
}
