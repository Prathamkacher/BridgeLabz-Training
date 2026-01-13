/*
 * 23. "BudgetWise – Personal Finance Tracker"
Story: BudgetWise helps users plan monthly budgets and track income/expenses across
categories.
Requirements:
● Transaction class: amount, type, date, category.
● Budget class: income, limit, categoryLimits[].
● Interface IAnalyzable with generateReport() and detectOverspend().
● Constructors for monthly budgets with custom categories.
● Use operators to calculate net savings: income - totalExpenses.
● Encapsulation: restrict direct expense editing.
● Inheritance: MonthlyBudget, AnnualBudget.
● Polymorphism: report format varies (monthly vs yearly).
 */

package com.day9.budgetwise;

import java.util.*;

public class BudgetWiseMain {

    public static void main(String[] args) {

        Map<String, Double> categories = new HashMap<>();
        categories.put("Food", 5000.0);
        categories.put("Travel", 3000.0);

        Budget monthly = new MonthlyBudget(20000, 15000, categories);

        monthly.addTransaction(new Transaction(2000, "Expense", "01-08-2025", "Food"));
        monthly.addTransaction(new Transaction(3000, "Expense", "05-08-2025", "Travel"));
        monthly.addTransaction(new Transaction(1000, "Expense", "10-08-2025", "Food"));

        monthly.generateReport();
        monthly.detectOverspend();

        Budget yearly = new AnnualBudget(240000, 180000, categories);
        yearly.addTransaction(new Transaction(50000, "Expense", "2025", "General"));

        yearly.generateReport();
        yearly.detectOverspend();
    }
}