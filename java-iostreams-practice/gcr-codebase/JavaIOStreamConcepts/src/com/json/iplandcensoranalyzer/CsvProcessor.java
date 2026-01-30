package com.json.iplandcensoranalyzer;

import org.json.*;
import java.io.*;
import java.nio.file.*;

public class CsvProcessor {

    public static void process() throws Exception {

        String csvData = new String(Files.readAllBytes(Paths.get("P:\\BridgeLabz-Training\\java-iostreams-practice\\gcr-codebase\\JavaIOStreamConcepts\\src\\com\\json\\iplandcensoranalyzer\\input.csv")));
        csvData = csvData.replace("\r", "").trim();

        JSONArray arr = CDL.toJSONArray(csvData);

        for (int i = 0; i < arr.length(); i++) {
            JSONObject obj = arr.getJSONObject(i);
            obj.put("team1", Censor.maskTeam(obj.getString("team1")));
            obj.put("team2", Censor.maskTeam(obj.getString("team2")));
            obj.put("winner", Censor.maskTeam(obj.getString("winner")));
            obj.put("player_of_match", "REDACTED");
        }

        String outputCsv = CDL.toString(arr);
        Files.write(Paths.get("P:\\BridgeLabz-Training\\java-iostreams-practice\\gcr-codebase\\JavaIOStreamConcepts\\src\\com\\json\\iplandcensoranalyzer\\output.csv"), outputCsv.getBytes());
    }
}
