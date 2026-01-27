package com.day_2.dealtracker;

import java.time.LocalDate;

public class Deal extends Promotion<String> {

    String dealCode;
    int discount;
    LocalDate validTill;
    int minPurchase;

    public Deal(String dealCode, int discount, LocalDate validTill, int minPurchase) {
        super("Discount");
        this.dealCode = dealCode;
        this.discount = discount;
        this.validTill = validTill;
        this.minPurchase = minPurchase;
    }

    @Override
    public String toString() {
        return dealCode + " -> " + discount + "% off, Min: " + minPurchase +
                ", Valid Till: " + validTill;
    }
}
