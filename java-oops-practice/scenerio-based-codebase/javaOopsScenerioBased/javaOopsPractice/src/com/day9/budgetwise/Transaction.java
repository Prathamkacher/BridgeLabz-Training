package com.day9.budgetwise;

class Transaction {
    double amount;
    String type;     // Income or Expense
    String date;
    String category;

    public Transaction(double amount, String type, String date, String category) {
        this.amount = amount;
        this.type = type;
        this.date = date;
        this.category = category;
    }
}
