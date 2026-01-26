package com.annotationsandreflection.annotations.importantmethods;

import java.lang.reflect.Method;

public class ImportantMain {
    public static void main(String[] args) {

        Service service = new Service();
        Class<?> cls = service.getClass();

        for (Method method : cls.getDeclaredMethods()) {

            if (method.isAnnotationPresent(ImportantMethod.class)) {

                ImportantMethod im = method.getAnnotation(ImportantMethod.class);

                System.out.println(
                    "Method: " + method.getName() +
                    ", Level: " + im.level()
                );
            }
        }
    }
}
