package com.regexandjunit.regex;

public class ValidateCreditCard {

    public static boolean isValidCard(String cardNumber) {

        String regex = "^(4\\d{15}|5\\d{15})$";
        return cardNumber.matches(regex);
    }

    public static void main(String[] args) {

        String[] cards = {
            "4123456789012345",  // Visa
            "5123456789012345",  // MasterCard
            "6123456789012345",  // Invalid
            "412345678901234"    // Too short
        };

        for (String card : cards) {
            System.out.println(card + " → " + isValidCard(card));
        }
    }
}
