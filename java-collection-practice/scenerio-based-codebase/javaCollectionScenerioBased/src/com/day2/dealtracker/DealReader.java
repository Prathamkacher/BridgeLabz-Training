package com.day_2.dealtracker;

import java.io.*;
import java.time.*;
import java.time.format.*;
import java.util.*;
import java.util.regex.*;

public class DealReader {

    private static final Pattern CODE = Pattern.compile("DealCode: (\\w+)");
    private static final Pattern DATE = Pattern.compile("ValidTill: (\\d{2}-\\d{2}-\\d{4})");
    private static final Pattern DISCOUNT = Pattern.compile("Discount: (\\d+)%");
    private static final Pattern MIN = Pattern.compile("MinimumPurchase: (\\d+)");

    public static List<Deal> readDeals(String filePath) {
        List<Deal> deals = new ArrayList<>();

        try (FileInputStream fis = new FileInputStream(filePath);
             BufferedReader br = new BufferedReader(new InputStreamReader(fis))) {

            String line;
            String code = null, date = null, disc = null, min = null;

            while ((line = br.readLine()) != null) {

                if (CODE.matcher(line).find()) code = line.split(": ")[1];
                if (DATE.matcher(line).find()) date = line.split(": ")[1];
                if (DISCOUNT.matcher(line).find()) disc = line.split(": ")[1].replace("%", "");
                if (MIN.matcher(line).find()) min = line.split(": ")[1];

                if (code != null && date != null && disc != null && min != null) {
                    LocalDate d = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
                    deals.add(new Deal(code, Integer.parseInt(disc), d, Integer.parseInt(min)));
                    code = date = disc = min = null;
                }
            }

        } catch (Exception e) {
            System.out.println("Error reading deals");
        }
        return deals;
    }
}
