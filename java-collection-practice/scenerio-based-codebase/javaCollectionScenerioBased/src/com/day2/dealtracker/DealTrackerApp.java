package com.day_2.dealtracker;

import java.util.*;

public class DealTrackerApp {

    public static void main(String[] args) {

        List<Deal> deals = DealReader.readDeals("deals.txt");

        Map<String, Deal> validDeals = DealManager.filterValidDeals(deals);

        List<Deal> sorted = DealManager.sortByDiscount(validDeals);

        System.out.println("=== Valid Deals Sorted by Discount ===");
        sorted.forEach(System.out::println);
    }
}
