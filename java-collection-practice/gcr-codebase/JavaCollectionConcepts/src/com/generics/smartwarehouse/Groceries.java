package com.generics.smartwarehouse;

public class Groceries extends WarehouseItem {

 private String expiryDate;

 public Groceries(String name, int quantity, String expiryDate) {
     super(name, quantity);
     this.expiryDate = expiryDate;
 }

 @Override
 public String getDetails() {
     return "Groceries: " + getName() +
            ", Qty: " + getQuantity() +
            ", Expiry: " + expiryDate;
 }
}
