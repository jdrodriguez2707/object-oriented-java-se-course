package ui;

import java.util.Scanner;

public class UIMenu {
    public static final String[] MONTHS = {
            "January", "February", "March", "April", "May", "June", "July", "August", "September", "October",
            "November", "December"
    };
    public static void showMenu() {
        Scanner read = new Scanner(System.in);
        int response = 0;

        System.out.println("Welcome to My Appointments");
        System.out.println("Select the desired option");

        do {
            System.out.println("1. Doctor");
            System.out.println("2. Patient");
            System.out.println("0. Exit");
            response = Integer.parseInt(read.nextLine());

            switch (response) {
                case 1 -> System.out.println("Doctor");
                case 2 -> {
                    response = 0;
                    showPatientMenu();
                }
                case 0 -> System.out.println("Thank you for your visit");
                default -> System.out.println("Please select a correct option");
            }
        } while (response != 0);

        read.close();
    }

    static void showPatientMenu() {
        Scanner read = new Scanner(System.in);
        int response = 0;

        do {
            System.out.println("\n\n");
            System.out.println("Patient");
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Return");
            response = Integer.parseInt(read.nextLine());

            switch (response) {
                case 1 -> {
                    System.out.println("::Book an appointment");
                    for (int i = 1; i < 4; i++) {
                        System.out.println(i + ". " + MONTHS[i - 1]);
                    }
                }
                case 2 -> System.out.println("::My appointments");
                case 0 -> showMenu();
                default -> System.out.println("Please select a correct option");
            }
        } while (response != 0);
    }
}
