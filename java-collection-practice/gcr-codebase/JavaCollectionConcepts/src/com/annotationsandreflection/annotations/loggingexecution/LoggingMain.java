package com.annotationsandreflection.annotations.loggingexecution;

import java.lang.reflect.Method;

public class LoggingMain {
    public static void main(String[] args) throws Exception {

        PerformanceTest pt = new PerformanceTest();
        Class<?> cls = pt.getClass();

        for (Method method : cls.getDeclaredMethods()) {

            if (method.isAnnotationPresent(LogExecutionTime.class)) {

                long start = System.nanoTime();

                method.invoke(pt);   // execute method

                long end = System.nanoTime();

                System.out.println(
                    "Method: " + method.getName() +
                    ", Execution Time: " + (end - start) + " ns"
                );
            }
        }
    }
}
