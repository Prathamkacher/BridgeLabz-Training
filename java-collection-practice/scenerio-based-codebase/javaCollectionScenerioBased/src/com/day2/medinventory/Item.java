package com.day_2.medinventory;

import java.util.Objects;

public class Item<T> {
    String itemId;
    String itemName;
    int quantity;
    String expiryDate;
    T category; // Medicine, SurgicalTool, etc.

    public Item(String itemId, String itemName, int quantity, String expiryDate, T category) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.quantity = quantity;
        this.expiryDate = expiryDate;
        this.category = category;
    }

    // Remove duplicates based on ItemID
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Item)) return false;
        Item<?> item = (Item<?>) o;
        return itemId.equals(item.itemId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemId);
    }

    @Override
    public String toString() {
        return itemName + " (" + quantity + ") Exp: " + expiryDate;
    }
}
