package com.day10.birdsantuary;

import java.util.Scanner;

public class BirdMain {

    public static void main(String[] args) {

        SanctuaryManager manager = new SanctuaryManager();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Bird");
            System.out.println("2. Display All");
            System.out.println("3. Display Flying");
            System.out.println("4. Display Swimming");
            System.out.println("5. Display Both");
            System.out.println("6. Delete by ID");
            System.out.println("7. Report");
            System.out.println("8. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter ID: ");
                    String id = sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Type (eagle/duck/penguin/kiwi): ");
                    String type = sc.nextLine();

                    switch (type.toLowerCase()) {
                        case "eagle" -> manager.addBird(new Eagle(id, name));
                        case "duck" -> manager.addBird(new Duck(id, name));
                        case "penguin" -> manager.addBird(new Penguin(id, name));
                        case "kiwi" -> manager.addBird(new Kiwi(id, name));
                        default -> System.out.println("Unknown bird type");
                    }
                }

                case 2 -> manager.displayAll();
                case 3 -> manager.showFlyingBirds();
                case 4 -> manager.showSwimmingBirds();
                case 5 -> manager.showBoth();
                case 6 -> {
                    System.out.print("Enter ID to delete: ");
                    manager.removeById(sc.nextLine());
                }
                case 7 -> manager.report();
                case 8 -> { return; }
            }
        }
    }
}
