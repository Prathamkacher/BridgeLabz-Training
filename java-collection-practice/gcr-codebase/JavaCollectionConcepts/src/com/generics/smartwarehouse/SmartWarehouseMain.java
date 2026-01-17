package com.generics.smartwarehouse;


public class SmartWarehouseMain {

 public static void main(String[] args) {

     Storage<Electronics> electronicsStorage = new Storage<>();
     electronicsStorage.addItem(new Electronics("Laptop", 10, 2));
     electronicsStorage.addItem(new Electronics("Mobile", 25, 1));

     Storage<Groceries> groceryStorage = new Storage<>();
     groceryStorage.addItem(new Groceries("Rice", 100, "2026-01-01"));
     groceryStorage.addItem(new Groceries("Milk", 50, "2025-02-10"));

     Storage<Furniture> furnitureStorage = new Storage<>();
     furnitureStorage.addItem(new Furniture("Chair", 20, "Wood"));
     furnitureStorage.addItem(new Furniture("Table", 5, "Metal"));

     System.out.println("---- Electronics ----");
     WarehouseUtils.displayItems(electronicsStorage.getItems());

     System.out.println("\n---- Groceries ----");
     WarehouseUtils.displayItems(groceryStorage.getItems());

     System.out.println("\n---- Furniture ----");
     WarehouseUtils.displayItems(furnitureStorage.getItems());
 }
}
