package com.json.jsonfilter;

import com.google.gson.Gson;
import java.io.FileReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterMain {
    public static void main(String[] args) throws Exception {

        Gson gson = new Gson();
        FileReader reader = new FileReader("P:\\BridgeLabz-Training\\java-iostreams-practice\\gcr-codebase\\JavaIOStreamConcepts\\src\\com\\json\\jsonfilter\\people.json");

        Person[] peopleArray = gson.fromJson(reader, Person[].class);
        List<Person> filtered = Arrays.stream(peopleArray)
                                      .filter(p -> p.getAge() > 25)
                                      .collect(Collectors.toList());

        System.out.println(gson.toJson(filtered));
    }
}
