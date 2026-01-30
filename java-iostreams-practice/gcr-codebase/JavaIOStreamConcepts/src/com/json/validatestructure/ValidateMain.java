package com.json.validatestructure;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;

public class ValidateMain {
    public static void main(String[] args) {

        ObjectMapper mapper = new ObjectMapper();

        try {
            mapper.readTree(new File("P:\\BridgeLabz-Training\\java-iostreams-practice\\gcr-codebase\\JavaIOStreamConcepts\\src\\com\\json\\validatestructure\\data.json"));
            System.out.println("Valid JSON structure");
        } catch (Exception e) {
            System.out.println("Invalid JSON structure");
        }
    }
}
