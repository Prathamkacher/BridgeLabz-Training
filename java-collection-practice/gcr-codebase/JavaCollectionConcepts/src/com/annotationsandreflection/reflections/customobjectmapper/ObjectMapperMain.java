package com.annotationsandreflection.reflections.customobjectmapper;

import java.util.HashMap;
import java.util.Map;

public class ObjectMapperMain {

    public static void main(String[] args) throws Exception {

        Map<String, Object> map = new HashMap<>();
        map.put("id", 1);
        map.put("name", "Pratham");

        User user = ObjectMapper.toObject(User.class, map);

        System.out.println(user.id);
        System.out.println(user.name);
    }
}