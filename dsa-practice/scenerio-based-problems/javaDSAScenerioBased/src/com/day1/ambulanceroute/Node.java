package com.day1.ambulanceroute;

public class Node {
    String unit;
    boolean available;
    Node next;

    Node(String unit, boolean available) {
        this.unit = unit;
        this.available = available;
    }
}