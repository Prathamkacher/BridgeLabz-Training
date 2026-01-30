package com.json.generatereport;

import com.google.gson.Gson;
import java.util.List;

public class GenerateReportMain {
    public static void main(String[] args) {

        List<Employee> records = DataSource.getRecords();

        Gson gson = new Gson();
        String jsonReport = gson.toJson(records);

        System.out.println(jsonReport);
    }
}
