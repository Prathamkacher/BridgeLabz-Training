package com.day_1.travellog;

import java.io.Serializable;

public class Trip implements Serializable {
    private static final long serialVersionUID = 1L;

    String city;
    String country;
    int durationDays;
    String notes;

    public Trip(String city, String country, int durationDays, String notes) {
        this.city = city;
        this.country = country;
        this.durationDays = durationDays;
        this.notes = notes;
    }

    @Override
    public String toString() {
        return city + ", " + country + " (" + durationDays + " days)";
    }
}
