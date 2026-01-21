package com.collections.BankingSystem;

import java.util.*;

public class Bank {

   
    private HashMap<Integer, Double> accounts = new HashMap<>();

    private Queue<WithdrawalRequest> withdrawalQueue = new LinkedList<>();

    // Create account
    public void addAccount(int accNo, double balance) {
        accounts.put(accNo, balance);
    }

    // Add withdrawal request
    public void requestWithdrawal(int accNo, double amount) {
        withdrawalQueue.offer(new WithdrawalRequest(accNo, amount));
    }

    // Process withdrawal requests
    public void processWithdrawals() {
        while (!withdrawalQueue.isEmpty()) {
            WithdrawalRequest wr = withdrawalQueue.poll();

            double balance = accounts.getOrDefault(wr.accountNumber, 0.0);

            if (balance >= wr.amount) {
                accounts.put(wr.accountNumber, balance - wr.amount);
                System.out.println("Withdrawal successful for Account "
                        + wr.accountNumber);
            } else {
                System.out.println("Insufficient balance for Account "
                        + wr.accountNumber);
            }
        }
    }

    // Display customers sorted by balance
    public void displaySortedByBalance() {
        TreeMap<Double, Integer> sortedMap = new TreeMap<>();

        for (Map.Entry<Integer, Double> entry : accounts.entrySet()) {
            sortedMap.put(entry.getValue(), entry.getKey());
        }

        System.out.println("Accounts Sorted by Balance:");
        sortedMap.forEach((balance, accNo) ->
                System.out.println("Account " + accNo + " : ₹" + balance));
    }
}
