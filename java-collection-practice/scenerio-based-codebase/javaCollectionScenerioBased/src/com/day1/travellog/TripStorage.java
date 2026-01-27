package com.day_1.travellog;

import java.io.*;
import java.util.*;

public class TripStorage {

    public static void saveTrips(List<Trip> trips, String fileName) throws Exception {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName));
        oos.writeObject(trips);
        oos.close();
    }

    public static List<Trip> loadTrips(String fileName) throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName));
        List<Trip> trips = (List<Trip>) ois.readObject();
        ois.close();
        return trips;
    }
}
