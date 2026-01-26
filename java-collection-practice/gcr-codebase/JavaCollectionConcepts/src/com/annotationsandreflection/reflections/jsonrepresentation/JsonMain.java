package com.annotationsandreflection.reflections.jsonrepresentation;

public class JsonMain {

    public static void main(String[] args) throws Exception {

        Person p = new Person(1, "Kanha");

        String json = Json.toJson(p);
        System.out.println(json);
    }
}