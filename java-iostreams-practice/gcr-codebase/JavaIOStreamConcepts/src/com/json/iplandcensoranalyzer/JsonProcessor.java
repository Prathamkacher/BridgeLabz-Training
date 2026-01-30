package com.json.iplandcensoranalyzer;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.*;
import java.lang.reflect.Type;
import java.util.List;

public class JsonProcessor {

    public static void process() throws Exception {
        Gson gson = new Gson();

        Reader reader = new FileReader("P:\\BridgeLabz-Training\\java-iostreams-practice\\gcr-codebase\\JavaIOStreamConcepts\\src\\com\\json\\iplandcensoranalyzer\\input.json");
        Type listType = new TypeToken<List<Match>>(){}.getType();
        List<Match> matches = gson.fromJson(reader, listType);

        for (Match m : matches) {
            Censor.censorMatch(m);
        }

        Writer writer = new FileWriter("P:\\BridgeLabz-Training\\java-iostreams-practice\\gcr-codebase\\JavaIOStreamConcepts\\src\\com\\json\\iplandcensoranalyzer\\output.json");
        gson.toJson(matches, writer);
        writer.close();
    }
}
