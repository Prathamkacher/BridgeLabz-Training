package com.json.jsonformat;

import com.google.gson.Gson;

public class FormatMain {
    public static void main(String[] args) {

        Car car = new Car("Tesla", 2024, "Red");

        Gson gson = new Gson();
        String json = gson.toJson(car);

        System.out.println(json);
    }
}
