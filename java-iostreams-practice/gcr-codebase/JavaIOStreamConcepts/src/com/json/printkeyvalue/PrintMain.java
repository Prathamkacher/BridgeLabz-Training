package com.json.printkeyvalue;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.io.FileReader;
import java.util.Map;

public class PrintMain {
    public static void main(String[] args) throws Exception {

        Gson gson = new Gson();
        FileReader reader = new FileReader("P:\\BridgeLabz-Training\\java-iostreams-practice\\gcr-codebase\\JavaIOStreamConcepts\\src\\com\\json\\printkeyvalue\\data.json");

        JsonObject jsonObject = gson.fromJson(reader, JsonObject.class);

        for (Map.Entry<String, com.google.gson.JsonElement> entry : jsonObject.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
