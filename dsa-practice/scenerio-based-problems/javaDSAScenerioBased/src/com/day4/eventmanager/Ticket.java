package com.day4.eventmanager;

public class Ticket {
    int price;

    public Ticket(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "₹" + price;
    }
}
