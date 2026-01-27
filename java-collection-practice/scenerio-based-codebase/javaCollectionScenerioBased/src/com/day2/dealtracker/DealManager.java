package com.day_2.dealtracker;

import java.time.LocalDate;
import java.util.*;

public class DealManager {

    public static Map<String, Deal> filterValidDeals(List<Deal> deals) {

        Map<String, Deal> map = new HashMap<>();
        Set<String> uniqueCodes = new HashSet<>();

        for (Deal d : deals) {
            if (d.validTill.isBefore(LocalDate.now())) continue;
            if (!uniqueCodes.add(d.dealCode)) continue;

            map.put(d.dealCode, d);
        }
        return map;
    }

    public static List<Deal> sortByDiscount(Map<String, Deal> map) {
        List<Deal> list = new ArrayList<>(map.values());
        list.sort(Comparator.comparingInt(d -> -d.discount));
        return list;
    }
}
