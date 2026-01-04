package com.linkedlist.singlylinkedlist.inventorymanagement;

public class InventoryList {

    private ItemNode head;

    // Add at beginning
    public void addAtBeginning(int id, String name, int qty, double price) {
        ItemNode node = new ItemNode(id, name, qty, price);
        node.next = head;
        head = node;
    }

    // Add at end
    public void addAtEnd(int id, String name, int qty, double price) {
        ItemNode node = new ItemNode(id, name, qty, price);

        if (head == null) {
            head = node;
            return;
        }

        ItemNode temp = head;
        while (temp.next != null)
            temp = temp.next;

        temp.next = node;
    }

    // Add at specific position (1-based)
    public void addAtPosition(int pos, int id, String name, int qty, double price) {
        if (pos <= 1) {
            addAtBeginning(id, name, qty, price);
            return;
        }

        ItemNode temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++)
            temp = temp.next;

        if (temp == null) {
            System.out.println("Invalid position");
            return;
        }

        ItemNode node = new ItemNode(id, name, qty, price);
        node.next = temp.next;
        temp.next = node;
    }

    // Remove item by Item ID
    public void removeById(int id) {
        if (head == null) return;

        if (head.itemId == id) {
            head = head.next;
            return;
        }

        ItemNode temp = head;
        while (temp.next != null && temp.next.itemId != id)
            temp = temp.next;

        if (temp.next != null)
            temp.next = temp.next.next;
        else
            System.out.println("Item not found");
    }

    // Update quantity by Item ID
    public void updateQuantity(int id, int newQty) {
        ItemNode temp = head;

        while (temp != null) {
            if (temp.itemId == id) {
                temp.quantity = newQty;
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found");
    }

    // Search by Item ID
    public void searchById(int id) {
        ItemNode temp = head;

        while (temp != null) {
            if (temp.itemId == id) {
                displayItem(temp);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found");
    }

    // Search by Item Name
    public void searchByName(String name) {
        ItemNode temp = head;

        while (temp != null) {
            if (temp.itemName.equalsIgnoreCase(name)) {
                displayItem(temp);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found");
    }

    // Total inventory value
    public void totalInventoryValue() {
        double total = 0;
        ItemNode temp = head;

        while (temp != null) {
            total += temp.price * temp.quantity;
            temp = temp.next;
        }
        System.out.println("Total Inventory Value: " + total);
    }

    // Sort by Item Name (Ascending)
    public void sortByName() {
        head = mergeSortByName(head);
    }

    private ItemNode mergeSortByName(ItemNode node) {
        if (node == null || node.next == null)
            return node;

        ItemNode mid = getMiddle(node);
        ItemNode next = mid.next;
        mid.next = null;

        ItemNode left = mergeSortByName(node);
        ItemNode right = mergeSortByName(next);

        return mergeByName(left, right);
    }

    private ItemNode mergeByName(ItemNode a, ItemNode b) {
        if (a == null) return b;
        if (b == null) return a;

        if (a.itemName.compareTo(b.itemName) <= 0) {
            a.next = mergeByName(a.next, b);
            return a;
        } else {
            b.next = mergeByName(a, b.next);
            return b;
        }
    }

    private ItemNode getMiddle(ItemNode node) {
        ItemNode slow = node, fast = node.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Display all items
    public void displayAll() {
        ItemNode temp = head;
        while (temp != null) {
            displayItem(temp);
            temp = temp.next;
        }
    }

    private void displayItem(ItemNode i) {
        System.out.println(
            "ID: " + i.itemId +
            ", Name: " + i.itemName +
            ", Qty: " + i.quantity +
            ", Price: " + i.price
        );
    }
}
