package com.functionalinterface.function;

import java.util.function.Function;

public class MarksToGrade {
    public static void main(String[] args) {

        Function<Integer, String> getGrade = marks -> {
            if (marks >= 80) return "A";
            else if (marks >= 60) return "B";
            else return "C";
        };

        System.out.println("Grade: " + getGrade.apply(85));
    }
}
