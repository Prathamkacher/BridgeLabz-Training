package com.streams.serialization;

import java.io.*;
import java.util.List;

public class DeserializeEmployee {

    public static List<Employee> loadEmployees(String fileName)
            throws IOException, ClassNotFoundException {

        ObjectInputStream ois =
                new ObjectInputStream(new FileInputStream(fileName));

        List<Employee> employees =
                (List<Employee>) ois.readObject();

        ois.close();
        return employees;
    }
}
