package com.annotationsandreflection.reflections.methodexecution;

import java.lang.reflect.Method;

public class MethodTimer {

    public static void main(String[] args) throws Exception {

        Work obj = new Work();

        Class c = obj.getClass();
        Method method = c.getMethod("doWork");

        long start = System.nanoTime();     // start time
        method.invoke(obj);                 // dynamic method call
        long end = System.nanoTime();       // end time

        System.out.println("Execution Time (ns): " + (end - start));
    }
}