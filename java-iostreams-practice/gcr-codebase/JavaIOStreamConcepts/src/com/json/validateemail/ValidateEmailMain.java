package com.json.validateemail;

import org.everit.json.schema.Schema;
import org.everit.json.schema.loader.SchemaLoader;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.FileInputStream;

public class ValidateEmailMain {
    public static void main(String[] args) {

        try {
            JSONObject schemaJson = new JSONObject(
                    new JSONTokener(new FileInputStream("P:\\BridgeLabz-Training\\java-iostreams-practice\\gcr-codebase\\JavaIOStreamConcepts\\src\\com\\json\\validateemail\\schema.json")));
            Schema schema = SchemaLoader.load(schemaJson);

            JSONObject dataJson = new JSONObject(
                    new JSONTokener(new FileInputStream("P:\\BridgeLabz-Training\\java-iostreams-practice\\gcr-codebase\\JavaIOStreamConcepts\\src\\com\\json\\validateemail\\data.json")));

            schema.validate(dataJson);
            System.out.println("Valid email");

        } catch (Exception e) {
            System.out.println("Invalid email");
            e.printStackTrace();
        }
        
    }
}
