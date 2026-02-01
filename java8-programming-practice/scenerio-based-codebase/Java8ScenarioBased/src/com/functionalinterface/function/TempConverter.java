package com.functionalinterface.function;

import java.util.function.Function;

public class TempConverter {
    public static void main(String[] args) {

        Function<Double, Double> cToF = c -> (c * 9/5) + 32;

        System.out.println("Fahrenheit: " + cToF.apply(25.0));
    }
}
