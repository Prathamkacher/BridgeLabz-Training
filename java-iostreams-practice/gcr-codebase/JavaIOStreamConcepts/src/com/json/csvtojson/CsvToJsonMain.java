package com.json.csvtojson;

import org.json.JSONArray;
import org.json.CDL;

import java.nio.file.Files;
import java.nio.file.Paths;

public class CsvToJsonMain {
    public static void main(String[] args) throws Exception {

        String path = "P:\\BridgeLabz-Training\\java-iostreams-practice\\gcr-codebase\\JavaIOStreamConcepts\\src\\com\\json\\csvtojson\\data.csv";

        String csvData = new String(Files.readAllBytes(Paths.get(path)));

        // Remove Windows carriage returns
        csvData = csvData.replace("\r", "").trim();

        JSONArray jsonArray = CDL.toJSONArray(csvData);

        if (jsonArray == null) {
            System.out.println("CSV parsing failed ❌");
            return;
        }

        System.out.println(jsonArray.toString(2));
    }
}
