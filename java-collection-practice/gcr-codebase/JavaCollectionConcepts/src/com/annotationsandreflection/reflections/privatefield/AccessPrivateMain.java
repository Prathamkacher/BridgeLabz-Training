package com.annotationsandreflection.reflections.privatefield;

import java.lang.reflect.Field;

public class AccessPrivateMain {

    public static void main(String[] args) throws Exception {

        Person p = new Person();

        Class c = p.getClass();
        Field field = c.getDeclaredField("age");

        field.setAccessible(true);     // allow access to private field
        field.set(p, 25);              // modify value

        int value = (int) field.get(p); // retrieve value
        System.out.println("Age: " + value);
    }
}