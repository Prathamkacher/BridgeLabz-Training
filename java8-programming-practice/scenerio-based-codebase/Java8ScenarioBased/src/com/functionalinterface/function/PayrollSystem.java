package com.functionalinterface.function;

import java.util.function.Function;

public class PayrollSystem {
    public static void main(String[] args) {

        Function<Double, Double> annualSalary = monthly -> monthly * 12;

        System.out.println("Annual Salary: " + annualSalary.apply(40000.0));
    }
}
