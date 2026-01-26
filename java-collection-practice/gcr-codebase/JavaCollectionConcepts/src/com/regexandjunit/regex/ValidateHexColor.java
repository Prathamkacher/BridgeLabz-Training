package com.regexandjunit.regex;

public class ValidateHexColor {

    public static boolean isValidHexColor(String color) {
        String regex = "^#[0-9A-Fa-f]{6}$";
        return color.matches(regex);
    }

    public static void main(String[] args) {

        String[] colors = {
            "#FFA500",
            "#ff4500",
            "#123",
            "#GGGGGG"
        };

        for (String color : colors) {
            if (isValidHexColor(color)) {
                System.out.println(color + " → Valid");
            } else {
                System.out.println(color + " → Invalid");
            }
        }
    }
}
