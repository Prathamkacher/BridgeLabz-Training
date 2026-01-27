package com.csvdatahandling.encryptdecrypt;

import java.io.*;

public class EncryptDecryptMain {
    public static void main(String[] args) throws Exception {

        // WRITE encrypted data
        FileWriter fw = new FileWriter("P:\\BridgeLabz-Training\\java-iostreams-practice\\gcr-codebase\\JavaIOStreamConcepts\\src\\com\\csvdatahandling\\encryptdecrypt\\employees.csv");
        fw.write("ID,Name,Email,Salary\n");

        fw.write("1,Amit," +
                Crypt.encrypt("amit@gmail.com") + "," +
                Crypt.encrypt("50000") + "\n");

        fw.write("2,Neha," +
                Crypt.encrypt("neha@yahoo.com") + "," +
                Crypt.encrypt("45000") + "\n");

        fw.close();

        System.out.println("Encrypted CSV written.\n");

        // READ and decrypt data
        BufferedReader br = new BufferedReader(new FileReader("P:\\BridgeLabz-Training\\java-iostreams-practice\\gcr-codebase\\JavaIOStreamConcepts\\src\\com\\csvdatahandling\\encryptdecrypt\\employees.csv"));
        String line;

        br.readLine();

        System.out.println("Decrypted Data:");

        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");

            String email = Crypt.decrypt(data[2]);
            String salary = Crypt.decrypt(data[3]);

            System.out.println(
                "ID: " + data[0] +
                ", Name: " + data[1] +
                ", Email: " + email +
                ", Salary: " + salary
            );
        }

        br.close();
    }
}
