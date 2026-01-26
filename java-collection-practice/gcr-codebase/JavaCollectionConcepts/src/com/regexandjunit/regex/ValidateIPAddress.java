package com.regexandjunit.regex;

public class ValidateIPAddress {

    public static boolean isValidIP(String ip) {

        String regex =
            "^((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)\\.){3}" +
            "(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)$";

        return ip.matches(regex);
    }

    public static void main(String[] args) {

        String[] IPs = {
            "192.168.1.1",
            "255.255.255.255",
            "256.100.1.1",
            "192.168.1"
        };

        for (String ip : IPs) {
            System.out.println(ip + " → " + isValidIP(ip));
        }
    }
}
