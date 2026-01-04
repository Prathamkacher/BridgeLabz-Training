package com.linkedlist.singlylinkedlist.inventorymanagement;

public class InventoryMain {

    public static void main(String[] args) {

        InventoryList inventory = new InventoryList();

        inventory.addAtBeginning(101, "Mouse", 10, 500);
        inventory.addAtEnd(102, "Keyboard", 5, 1200);
        inventory.addAtPosition(2, 103, "Monitor", 3, 8000);

        inventory.displayAll();

        inventory.updateQuantity(101, 15);
        inventory.searchById(102);
        inventory.searchByName("Monitor");

        inventory.totalInventoryValue();

        inventory.sortByName();
        System.out.println("\nAfter Sorting by Name:");
        inventory.displayAll();
    }
}
