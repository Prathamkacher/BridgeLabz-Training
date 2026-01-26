package com.annotationsandreflection.reflections.staticfield;

import java.lang.reflect.Field;

public class StaticFieldMain {

    public static void main(String[] args) throws Exception {

        Class c = Configuration.class;
        Field field = c.getDeclaredField("API_KEY");

        field.setAccessible(true);          // access private field
        field.set(null, "NEW_API_KEY");     // modify static field

        System.out.println("API_KEY: " + field.get(null));
    }
}
