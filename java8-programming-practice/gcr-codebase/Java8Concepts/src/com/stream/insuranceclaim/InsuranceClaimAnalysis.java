package com.stream.insuranceclaim;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class InsuranceClaimAnalysis {

    public static void main(String[] args) {

        List<Claim> claims = List.of(
                new Claim(101, "Health", 45000),
                new Claim(102, "Vehicle", 32000),
                new Claim(103, "Health", 58000),
                new Claim(104, "Life", 100000),
                new Claim(105, "Vehicle", 40000),
                new Claim(106, "Health", 30000),
                new Claim(107, "Life", 150000)
        );

        Map<String, Double> averageClaimAmountByType = claims.stream()
                .collect(Collectors.groupingBy(
                        Claim::getClaimType,
                        Collectors.averagingDouble(Claim::getClaimAmount)
                ));

        System.out.println("Average Claim Amount by Claim Type");
        System.out.println("----------------------------------");

        averageClaimAmountByType.forEach((type, average) ->
                System.out.printf("%-10s : %.2f%n", type, average)
        );
    }
}
