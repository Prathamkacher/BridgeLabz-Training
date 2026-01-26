package com.annotationsandreflection.reflections.dynamicmehtod;

import java.lang.reflect.Method;
import java.util.Scanner;

public class InvocationMain {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter method name (add/subtract/multiply): ");
        String methodName = sc.nextLine();

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        MathOps obj = new MathOps();

        Class c = obj.getClass();
        Method method = c.getMethod(methodName, int.class, int.class);

        int result = (int) method.invoke(obj, a, b);
        System.out.println("Result: " + result);

        sc.close();
    }
}