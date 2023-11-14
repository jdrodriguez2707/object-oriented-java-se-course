package ui;

import java.util.Scanner;

public class UIPatientMenu {
    public static void showPatientMenu() {
        int response = 0;

        do {
            System.out.println("\n\n");
            System.out.println("Patient");
            System.out.println("Welcome " + UIMenu.patientLogged.getName());
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Logout");

            Scanner read = new Scanner(System.in);
            response = Integer.parseInt(read.nextLine());

            switch (response) {
                case 1 -> System.out.println("case 1");
                case 2 -> System.out.println("case 2");
                case 0 -> UIMenu.showMenu();
            }
        } while (response != 0);
    }

    private static void showBookAppointmentMenu() {
        int response = 0;

        do {
            System.out.println("::Book an appointment");
            System.out.println("::Select a date: ");
        } while (response != 0);
    }
}
