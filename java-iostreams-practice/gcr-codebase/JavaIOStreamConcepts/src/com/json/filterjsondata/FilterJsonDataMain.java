package com.json.filterjsondata;

import com.google.gson.Gson;
import java.io.FileReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterJsonDataMain {
    public static void main(String[] args) throws Exception {

        Gson gson = new Gson();
        FileReader reader = new FileReader("P:\\BridgeLabz-Training\\java-iostreams-practice\\gcr-codebase\\JavaIOStreamConcepts\\src\\com\\json\\filterjsondata\\users.json");

        User[] usersArray = gson.fromJson(reader, User[].class);

        List<User> filteredUsers = Arrays.stream(usersArray)
                                         .filter(user -> user.getAge() > 25)
                                         .collect(Collectors.toList());

        System.out.println(gson.toJson(filteredUsers));
    }
}
