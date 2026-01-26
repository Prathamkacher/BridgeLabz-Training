package com.annotationsandreflection.reflections.jsonrepresentation;

import java.lang.reflect.Field;

public class Json {

    public static String toJson(Object obj) throws Exception {

        Class c = obj.getClass();
        Field[] fields = c.getDeclaredFields();

        StringBuilder json = new StringBuilder("{");

        for (int i = 0; i < fields.length; i++) {
            Field f = fields[i];
            f.setAccessible(true);

            json.append("\"")
                .append(f.getName())
                .append("\":\"")
                .append(f.get(obj))
                .append("\"");

            if (i < fields.length - 1) {
                json.append(", ");
            }
        }

        json.append("}");
        return json.toString();
    }
}