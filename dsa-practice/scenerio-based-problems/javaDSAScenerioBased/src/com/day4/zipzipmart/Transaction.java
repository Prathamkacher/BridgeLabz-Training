package com.day4.zipzipmart;

public class Transaction {
    String date;   // yyyy-mm-dd
    int amount;

    public Transaction(String date, int amount) {
        this.date = date;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return date + " | ₹" + amount;
    }
}
