package com.json.listtoarray;

import com.google.gson.Gson;
import java.util.Arrays;
import java.util.List;

public class ListToArrMain {
    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student("Pratham", 22),
                new Student("Rahul", 21),
                new Student("Priya", 19)
        );

        Gson gson = new Gson();
        String jsonArray = gson.toJson(students);

        System.out.println(jsonArray);
    }
}
