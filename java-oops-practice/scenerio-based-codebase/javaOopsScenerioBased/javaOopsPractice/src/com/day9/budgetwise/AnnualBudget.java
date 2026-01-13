package com.day9.budgetwise;

import java.util.Map;

class AnnualBudget extends Budget {

    public AnnualBudget(double income, double limit, Map<String, Double> categoryLimits) {
        super(income, limit, categoryLimits);
    }

    @Override
    public void generateReport() {
        System.out.println("\n📆 Annual Budget Report");
        System.out.println("Yearly Income: " + income);
        System.out.println("Yearly Expenses: " + getTotalExpenses());
        System.out.println("Yearly Savings: " + getNetSavings());
    }
}