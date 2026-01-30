package com.json.mergejsonfiles;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.io.FileReader;
import java.util.Map;

public class MergeMain {
    public static void main(String[] args) throws Exception {

        Gson gson = new Gson();

        JsonObject obj1 = gson.fromJson(new FileReader("P:\\BridgeLabz-Training\\java-iostreams-practice\\gcr-codebase\\JavaIOStreamConcepts\\src\\com\\json\\mergejsonfiles\\file1.json"), JsonObject.class);
        JsonObject obj2 = gson.fromJson(new FileReader("P:\\BridgeLabz-Training\\java-iostreams-practice\\gcr-codebase\\JavaIOStreamConcepts\\src\\com\\json\\mergejsonfiles\\file2.json"), JsonObject.class);

        for (Map.Entry<String, JsonElement> entry : obj2.entrySet()) {
            obj1.add(entry.getKey(), entry.getValue());
        }

        System.out.println(gson.toJson(obj1));
    }
}
