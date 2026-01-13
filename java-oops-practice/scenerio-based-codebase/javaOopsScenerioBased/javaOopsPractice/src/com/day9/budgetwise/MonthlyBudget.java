package com.day9.budgetwise;

import java.util.Map;

class MonthlyBudget extends Budget {

    public MonthlyBudget(double income, double limit, Map<String, Double> categoryLimits) {
        super(income, limit, categoryLimits);
    }

    @Override
    public void generateReport() {
        System.out.println("\n📅 Monthly Budget Report");
        System.out.println("Income: " + income);
        System.out.println("Total Expenses: " + getTotalExpenses());
        System.out.println("Net Savings: " + getNetSavings());
    }
}
