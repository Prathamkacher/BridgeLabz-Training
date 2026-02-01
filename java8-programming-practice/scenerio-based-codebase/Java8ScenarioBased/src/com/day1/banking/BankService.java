package com.day1.banking;

import java.util.function.*;

public class BankService {

    public static Predicate<Account> minimumBalanceRule =
            acc -> acc.getBalance() >= 1000;

    public static BiFunction<Account, Double, Double> calculateInterest =
            (acc, rate) -> (acc.getBalance() * rate * acc.getYears()) / 100;

    public static BiPredicate<Account, Double> validateWithdrawal =
            (acc, amount) -> amount <= acc.getBalance();

    public static Consumer<Account> printAccount =
            acc -> System.out.println(acc);

    public static BiFunction<Account, Account, String> compareBalance =
            (a1, a2) -> {
                if (a1.getBalance() > a2.getBalance())
                    return a1.getAccountHolder() + " has higher balance.";
                else if (a1.getBalance() < a2.getBalance())
                    return a2.getAccountHolder() + " has higher balance.";
                else
                    return "Both accounts have equal balance.";
            };
}
