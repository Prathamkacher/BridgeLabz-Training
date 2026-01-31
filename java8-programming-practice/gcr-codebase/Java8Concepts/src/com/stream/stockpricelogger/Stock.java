package com.stream.stockpricelogger;

import java.time.LocalDateTime;

public class Stock {
    private String symbol;
    private double price;
    private LocalDateTime timestamp;

    public Stock(String symbol, double price) {
        this.symbol = symbol;
        this.price = price;
        this.timestamp = LocalDateTime.now();
    }

    public String getSymbol() {
        return symbol;
    }

    public double getPrice() {
        return price;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return "Stock: " + symbol +
               " | Price: ₹" + price +
               " | Time: " + timestamp;
    }
}