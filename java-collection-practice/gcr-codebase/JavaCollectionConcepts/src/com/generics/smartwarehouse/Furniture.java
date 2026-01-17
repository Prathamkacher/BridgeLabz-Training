package com.generics.smartwarehouse;

public class Furniture extends WarehouseItem {

 private String material;

 public Furniture(String name, int quantity, String material) {
     super(name, quantity);
     this.material = material;
 }

 @Override
 public String getDetails() {
     return "Furniture: " + getName() +
            ", Qty: " + getQuantity() +
            ", Material: " + material;
 }
}
