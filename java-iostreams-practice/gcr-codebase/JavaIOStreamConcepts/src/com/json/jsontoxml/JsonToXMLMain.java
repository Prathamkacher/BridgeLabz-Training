package com.json.jsontoxml;

import org.json.JSONObject;
import org.json.XML;

import java.nio.file.Files;
import java.nio.file.Paths;

public class JsonToXMLMain {
    public static void main(String[] args) throws Exception {

        String jsonData = new String(Files.readAllBytes(Paths.get("P:\\BridgeLabz-Training\\java-iostreams-practice\\gcr-codebase\\JavaIOStreamConcepts\\src\\com\\json\\jsontoxml\\data.json")));

        JSONObject jsonObject = new JSONObject(jsonData);
        String xmlData = XML.toString(jsonObject);

        System.out.println("<root>" + xmlData + "</root>");
    }
}
