package com.annotationsandreflection.reflections.dynamicobject;

public class DynamicObjectMain {

    public static void main(String[] args) throws Exception {

        Class c = Class.forName(
                "com.annotationsandreflection.reflections.dynamicobject.Student"
        );

        Object obj = c.getDeclaredConstructor().newInstance();
    }
}