package com.ioandstringsandsearching.stringbuilder.problem1;

public class ReverseString {

    // Method to reverse a string using StringBuilder
    public static String reverseString(String input) {

        StringBuilder sb = new StringBuilder();
        sb.append(input);
        sb.reverse();

        return sb.toString();
    }
}