package com.stream.loggingtransaction;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> transactionIds = Arrays.asList(
                "T-101",
                "T-102",
                "T-103",
                "T-104"
        );

        TransactionLogger logger = new TransactionLogger();

        transactionIds.forEach(id ->
                logger.logTransaction(id)
        );
    }
}
