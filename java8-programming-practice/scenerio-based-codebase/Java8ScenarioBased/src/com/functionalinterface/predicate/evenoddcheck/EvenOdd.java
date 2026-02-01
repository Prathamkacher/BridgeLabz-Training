package com.functionalinterface.predicate.evenoddcheck;

import java.util.function.Predicate;

public class EvenOdd {

    public static void main(String[] args) {

        Predicate<Integer> isEven = num -> num % 2 == 0;

        checkNumber(10, isEven);
        checkNumber(7, isEven);
        checkNumber(24, isEven);
    }

    public static void checkNumber(int number, Predicate<Integer> rule) {
        if (rule.test(number)) {
            System.out.println(number + " is EVEN.");
        } else {
            System.out.println(number + " is ODD.");
        }
    }
}
