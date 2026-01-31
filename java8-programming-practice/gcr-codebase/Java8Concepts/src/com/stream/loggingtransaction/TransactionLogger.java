package com.stream.loggingtransaction;

import java.time.LocalDateTime;

public class TransactionLogger {

    public void logTransaction(String transactionId) {

        System.out.println(LocalDateTime.now()
                + " - Transaction: "
                + transactionId
                + " | Status: Logged successfully");
    }
}
