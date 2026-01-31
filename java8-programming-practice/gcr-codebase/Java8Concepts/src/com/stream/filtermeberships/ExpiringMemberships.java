package com.stream.filtermeberships;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class ExpiringMemberships {

    public static void main(String[] args) {

        List<Member> members = List.of(
                new Member("Amit Sharma", LocalDate.now().plusDays(10)),
                new Member("Neha Verma", LocalDate.now().plusDays(45)),
                new Member("Rahul Mehta", LocalDate.now().plusDays(25)),
                new Member("Priya Singh", LocalDate.now().plusDays(5)),
                new Member("Karan Batra", LocalDate.now().plusDays(60))
        );

        LocalDate today = LocalDate.now();
        LocalDate next30Days = today.plusDays(30);

        List<Member> expiringSoonMembers = members.stream()
                .filter(member ->
                        !member.getExpiryDate().isBefore(today)
                                && !member.getExpiryDate().isAfter(next30Days))
                .collect(Collectors.toList());

        System.out.println("Members with Membership Expiring in Next 30 Days");
        System.out.println("------------------------------------------------");

        for (Member member : expiringSoonMembers) {
            System.out.printf("%-15s Expiry Date: %s%n",
                    member.getName(),
                    member.getExpiryDate());
        }
    }
}
