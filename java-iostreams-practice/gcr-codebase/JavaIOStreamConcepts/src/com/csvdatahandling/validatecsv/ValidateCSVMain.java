package com.csvdatahandling.validatecsv;

import java.io.BufferedReader;
import java.io.FileReader;

public class ValidateCSVMain {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader("P:\\BridgeLabz-Training\\java-iostreams-practice\\gcr-codebase\\JavaIOStreamConcepts\\src\\com\\csvdatahandling\\validatecsv\\users.csv"));
        String line;

        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        String phoneRegex = "\\d{10}";

        br.readLine();

        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");

            User u = new User(
                Integer.parseInt(data[0]),
                data[1],
                data[2],
                data[3]
            );

            boolean emailValid = u.email.matches(emailRegex);
            boolean phoneValid = u.phone.matches(phoneRegex);

            if (!emailValid || !phoneValid) {
                System.out.println("Invalid Row → ID: " + u.id +
                        ", Email: " + u.email +
                        ", Phone: " + u.phone);
            }
        }

        br.close();
    }
}
