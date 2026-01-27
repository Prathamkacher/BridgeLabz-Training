package com.day_2.dealtracker;

public class Promotion<T> {
    T type;  // Discount, Cashback, Referral

    public Promotion(T type) {
        this.type = type;
    }
}
