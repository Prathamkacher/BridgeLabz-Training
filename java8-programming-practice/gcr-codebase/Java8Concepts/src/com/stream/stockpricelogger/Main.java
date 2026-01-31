package com.stream.stockpricelogger;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Stock> liveFeed = Arrays.asList(
                new Stock("TCS", 3450.75),
                new Stock("INFY", 1560.40),
                new Stock("RELIANCE", 2750.10),
                new Stock("HDFC", 1650.00)
        );

        System.out.println("📈 Live Stock Updates:\n");

        // Using Stream API with method reference
        liveFeed.stream()
                .forEach(System.out::println);
    }
}