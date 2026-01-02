package com.day2.ewalletapplication;

class Transaction {
    private String transactionId;
    private String details;

    Transaction(String id, String details) {
        this.transactionId = id;
        this.details = details;
    }

    public void showTransaction() {
        System.out.println(transactionId + " : " + details);
    }
}
