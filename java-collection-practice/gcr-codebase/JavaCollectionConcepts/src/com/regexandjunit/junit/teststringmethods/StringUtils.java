package com.regexandjunit.junit.teststringmethods;

public class StringUtils {

    // Reverse a string
    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    // Check palindrome
    public static boolean isPalindrome(String str) {
        String reversed = reverse(str);
        return str.equals(reversed);
    }

    // Convert to uppercase
    public static String toUpperCase(String str) {
        return str.toUpperCase();
    }
}
