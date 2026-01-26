package com.streams.serialization;

import java.io.*;
import java.util.List;

public class SerializeEmployee {

    public static void saveEmployees(List<Employee> employees, String fileName)
            throws IOException {

        ObjectOutputStream oos =
                new ObjectOutputStream(new FileOutputStream(fileName));

        oos.writeObject(employees);
        oos.close();
    }
}
