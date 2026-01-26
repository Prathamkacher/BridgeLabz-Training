package com.annotationsandreflection.annotations.maxlengthannotation;

public class MaxLengthMain {
    public static void main(String[] args) {

        try {
            User u1 = new User("Pratham");
            System.out.println("User created: " + u1.getUsername());

            User u2 = new User("VeryLongUsername");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
