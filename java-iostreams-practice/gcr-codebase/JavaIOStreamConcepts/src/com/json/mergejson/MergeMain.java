package com.json.mergejson;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.io.FileReader;

public class MergeMain {
    public static void main(String[] args) throws Exception {

        Gson gson = new Gson();

        JsonObject obj1 = gson.fromJson(new FileReader("P:\\BridgeLabz-Training\\java-iostreams-practice\\gcr-codebase\\JavaIOStreamConcepts\\src\\com\\json\\mergejson\\json1.json"), JsonObject.class);
        JsonObject obj2 = gson.fromJson(new FileReader("P:\\BridgeLabz-Training\\java-iostreams-practice\\gcr-codebase\\JavaIOStreamConcepts\\src\\com\\json\\mergejson\\json2.json"), JsonObject.class);

        obj2.entrySet().forEach(entry -> obj1.add(entry.getKey(), entry.getValue()));

        System.out.println(obj1.toString());
    }
}
