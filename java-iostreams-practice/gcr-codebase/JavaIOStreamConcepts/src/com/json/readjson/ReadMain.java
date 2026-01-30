package com.json.readjson;

import com.google.gson.Gson;
import java.io.FileReader;

public class ReadMain {
    public static void main(String[] args) throws Exception {

        Gson gson = new Gson();
        FileReader reader = new FileReader("P:\\BridgeLabz-Training\\java-iostreams-practice\\gcr-codebase\\JavaIOStreamConcepts\\src\\com\\json\\readjson\\user.json");

        User user = gson.fromJson(reader, User.class);

        System.out.println("Name: " + user.getName());
        System.out.println("Email: " + user.getEmail());
    }
}
