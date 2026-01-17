package com.generics.smartwarehouse;

import java.util.List;

public class WarehouseUtils {

 // Wildcard method
 public static void displayItems(List<? extends WarehouseItem> items) {
     for (WarehouseItem item : items) {
         System.out.println(item.getDetails());
     }
 }
}
