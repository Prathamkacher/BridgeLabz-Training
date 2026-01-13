package com.day9.budgetwise;

import java.util.*;

abstract class Budget implements IAnalyzable {

    protected double income;
    protected double limit;
    protected Map<String, Double> categoryLimits;

    private List<Transaction> transactions = new ArrayList<>();

    public Budget(double income, double limit, Map<String, Double> categoryLimits) {
        this.income = income;
        this.limit = limit;
        this.categoryLimits = categoryLimits;
    }

    // Only safe way to add expenses/income
    public void addTransaction(Transaction t) {
        transactions.add(t);
    }

    protected double getTotalExpenses() {
        double total = 0;
        for (Transaction t : transactions) {
            if (t.type.equalsIgnoreCase("Expense")) {
                total += t.amount;
            }
        }
        return total;
    }

    protected double getNetSavings() {
        return income - getTotalExpenses();   // operator used
    }

    @Override
    public void detectOverspend() {
        double spent = getTotalExpenses();
        if (spent > limit) {
            System.out.println("Overspending detected! Limit exceeded.");
        } else {
            System.out.println("Spending under control.");
        }
    }
}
