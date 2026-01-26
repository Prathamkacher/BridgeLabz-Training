package com.annotationsandreflection.reflections.dependecyinjection;

import java.lang.reflect.Field;

public class DIContainer {

    public static <T> T create(Class<T> clazz) throws Exception {

        T obj = clazz.getDeclaredConstructor().newInstance();

        for (Field field : clazz.getDeclaredFields()) {
            if (field.isAnnotationPresent(Inject.class)) {

                Object dependency =
                        field.getType().getDeclaredConstructor().newInstance();

                field.setAccessible(true);
                field.set(obj, dependency);
            }
        }

        return obj;
    }
}
