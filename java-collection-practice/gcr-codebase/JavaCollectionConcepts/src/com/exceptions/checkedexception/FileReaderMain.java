package com.exceptions.checkedexception;

import java.io.*;

public class FileReaderMain {
    public static void main(String[] args) {

        try {
            FileReader file = new FileReader("src/com/exceptions/checkedexception/data.txt");
            BufferedReader br = new BufferedReader(file);

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
        }
        catch (IOException e) {
            System.out.println("File not found");
        }
    }
}
