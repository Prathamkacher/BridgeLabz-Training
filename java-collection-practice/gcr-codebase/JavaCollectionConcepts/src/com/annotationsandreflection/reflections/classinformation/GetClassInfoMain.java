package com.annotationsandreflection.reflections.classinformation;

import java.lang.reflect.*;
import java.util.Scanner;

public class GetClassInfoMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter class name: ");
        String className = sc.nextLine();

        try {
            Class c = Class.forName(className);

            System.out.println("\nMethods:");
            Method[] methods = c.getDeclaredMethods();
            for (Method m : methods) {
                System.out.println(m.getName());
            }

            System.out.println("\nFields:");
            Field[] fields = c.getDeclaredFields();
            for (Field f : fields) {
                System.out.println(f.getName());
            }

            System.out.println("\nConstructors:");
            Constructor[] constructors = c.getDeclaredConstructors();
            for (Constructor con : constructors) {
                System.out.println(con.getName());
            }

        } catch (ClassNotFoundException e) {
            System.out.println("Class not found");
        }

        sc.close();
    }
}
