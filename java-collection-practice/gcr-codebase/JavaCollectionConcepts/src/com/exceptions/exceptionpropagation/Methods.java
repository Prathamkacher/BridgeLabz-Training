package com.exceptions.exceptionpropagation;

public class Methods {

    static void method1() {
        int result = 10 / 0;   // ArithmeticException occurs here
    }

    static void method2() {
        method1();   // Exception propagates to here
    }

    public static void main(String[] args) {

        try {
            method2();   // Exception reaches here
        }
        catch (ArithmeticException e) {
            System.out.println("Handled exception in main");
        }
    }
}
