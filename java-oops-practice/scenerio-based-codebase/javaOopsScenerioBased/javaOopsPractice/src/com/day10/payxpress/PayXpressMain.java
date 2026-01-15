/*
 * 25. "PayXpress – Utility Bill Payment System"
Story: PayXpress enables users to pay utility bills (electricity, water, internet) with tracking and
reminders.
Requirements:
● Bill class: type, amount, dueDate, isPaid.
● Interface IPayable with pay() and sendReminder().
● Use constructors to create recurring bills.
● Operators for calculating late fees: baseAmount + penalty.
● Encapsulation: prevent direct payment status changes.
● Inheritance: ElectricityBill, InternetBill, WaterBill.
● Polymorphism: reminders vary depending on utility type.
● Access Modifiers: payment details are internal only.

 */

package com.day10.payxpress;

public class PayXpressMain {

    public static void main(String[] args) {

        Bill electricity = new ElectricityBill(500, "10-Feb-2026");
        Bill internet = new InternetBill(799, "16-Feb-2026");
        Bill water = new WaterBill(300, "16-Feb-2026");

        // Polymorphism: different reminders
        electricity.sendReminder();
        internet.sendReminder();
        water.sendReminder();

        // Late fee calculation using operator
        System.out.println("\nElectricity bill with late fee: ₹" + electricity.calculateLateFee(50));

        // Payment
        electricity.pay(500);

        System.out.println("Electricity bill paid? " + electricity.isPaid());
    }
}
