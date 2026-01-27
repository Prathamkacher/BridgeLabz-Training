package com.csvdatahandling.encryptdecrypt;

public class Crypt {

    static String encrypt(String data) {
        String result = "";
        for (char c : data.toCharArray()) {
            result += (char) (c + 2); // shift forward
        }
        return result;
    }

    static String decrypt(String data) {
        String result = "";
        for (char c : data.toCharArray()) {
            result += (char) (c - 2); // shift backward
        }
        return result;
    }
}
