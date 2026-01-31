package com.stream.emailnotifications;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> emails = Arrays.asList(
                "aman.sharma@gmail.com",
                "riya.mehta@gmail.com",
                "kunal.verma@gmail.com",
                "vishal.bhakhre@bridgelabz.com"
        );

        EmailService emailService = new EmailService();

        emails.forEach(email ->
                emailService.sendEmailNotification(email)
        );
    }
}
