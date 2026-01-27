package com.day_1.feedbackguru;

public class Feedback<T> {
    T type;          // Service, Product, etc.
    String message;  // feedback text
    int rating;      // extracted rating

    public Feedback(T type, String message, int rating) {
        this.type = type;
        this.message = message;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "[" + type + "] " + message + " (Rating: " + rating + "/10)";
    }
}
