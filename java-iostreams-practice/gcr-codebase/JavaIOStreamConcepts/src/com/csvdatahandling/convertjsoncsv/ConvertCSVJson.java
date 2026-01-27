package com.csvdatahandling.convertjsoncsv;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ConvertCSVJson {

    public static void main(String[] args) throws Exception {
        jsonToCsv();
        csvToJson();
    }

    // JSON to CSV
    static void jsonToCsv() throws Exception {

        BufferedReader br = new BufferedReader(new FileReader("P:\\BridgeLabz-Training\\java-iostreams-practice\\gcr-codebase\\JavaIOStreamConcepts\\src\\com\\csvdatahandling\\convertjsoncsv\\students.json"));
        FileWriter fw = new FileWriter("P:\\BridgeLabz-Training\\java-iostreams-practice\\gcr-codebase\\JavaIOStreamConcepts\\src\\com\\csvdatahandling\\convertjsoncsv\\students.csv");

        fw.write("ID,Name,Age,Marks\n");

        String line;
        while ((line = br.readLine()) != null) {
            line = line.trim();
            if (line.startsWith("{")) {
                line = line.replace("{", "")
                           .replace("}", "")
                           .replace("\"", "");

                String[] data = line.split(",");

                fw.write(
                    data[0].split(":")[1] + "," +
                    data[1].split(":")[1] + "," +
                    data[2].split(":")[1] + "," +
                    data[3].split(":")[1] + "\n"
                );
            }
        }

        br.close();
        fw.close();
        System.out.println("JSON converted to CSV");
    }

    // CSV to JSON
    static void csvToJson() throws Exception {

        BufferedReader br = new BufferedReader(new FileReader("P:\\BridgeLabz-Training\\java-iostreams-practice\\gcr-codebase\\JavaIOStreamConcepts\\src\\com\\csvdatahandling\\convertjsoncsv\\students.csv"));
        FileWriter fw = new FileWriter("P:\\BridgeLabz-Training\\java-iostreams-practice\\gcr-codebase\\JavaIOStreamConcepts\\src\\com\\csvdatahandling\\convertjsoncsv\\students_converted.json");

        List<Student> list = new ArrayList<>();
        String line;

        br.readLine();

        while ((line = br.readLine()) != null) {
            String[] d = line.split(",");
            list.add(new Student(
                Integer.parseInt(d[0]),
                d[1],
                Integer.parseInt(d[2]),
                Integer.parseInt(d[3])
            ));
        }

        fw.write("[\n");
        for (int i = 0; i < list.size(); i++) {
            fw.write("  " + list.get(i).toJSON());
            if (i < list.size() - 1) fw.write(",");
            fw.write("\n");
        }
        fw.write("]");

        br.close();
        fw.close();
        System.out.println("CSV converted to JSON");
    }
}
