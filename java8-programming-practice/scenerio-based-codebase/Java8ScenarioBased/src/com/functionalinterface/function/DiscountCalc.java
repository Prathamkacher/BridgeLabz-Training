package com.functionalinterface.function;

import java.util.function.Function;

public class DiscountCalc {
    public static void main(String[] args) {

        Function<Double, Double> applyDiscount = price -> price * 0.9;

        System.out.println("Discounted Price: " + applyDiscount.apply(2000.0));
    }
}
