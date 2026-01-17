package com.generics.smartwarehouse;

public class Electronics extends WarehouseItem {

 private int warrantyYears;

 public Electronics(String name, int quantity, int warrantyYears) {
     super(name, quantity);
     this.warrantyYears = warrantyYears;
 }

 @Override
 public String getDetails() {
     return "Electronics: " + getName() +
            ", Qty: " + getQuantity() +
            ", Warranty: " + warrantyYears + " years";
 }
}
