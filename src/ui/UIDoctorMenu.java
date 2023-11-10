package ui;

import java.util.Scanner;

public class UIDoctorMenu {
    public static void showDoctorMenu() {
        int response = 0;

        do {
            System.out.println("\n\n");
            System.out.println("Doctor");
            System.out.println("Welcome " + UIMenu.doctorLogged.getName());
            System.out.println("1. Add available appointment");
            System.out.println("2. My scheduled appointments");
            System.out.println("0. Logout");

            Scanner read = new Scanner(System.in);
            response = Integer.parseInt(read.nextLine());

            switch (response) {
                case 1 -> {
                    // response = 0;
                    // showAddAvailableAppointmentsMenu();
                }
                case 0 -> UIMenu.showMenu();
            }
        } while (response != 0);
    }

    private static void showAddAvailableAppointmentsMenu() {
        int response = 0;

        do {
            System.out.println();
            System.out.println("::Add available appointment");
            System.out.println("::Select a month");
            for (int i = 1; i < 4; i++) {
                System.out.println(i + ". " + UIMenu.Month.values()[i - 1].getLowercase());
            }
            System.out.println("0. Return");
            Scanner read = new Scanner(System.in);
            response = Integer.parseInt(read.nextLine());

            if (response > 0 && response < 4) {
                // 1,2,3
                int monthSelected = response;
                System.out.println(monthSelected + ". " + UIMenu.Month.values()[monthSelected - 1].getLowercase());
                System.out.println("Enter the available date: [dd/mm/yyyy]");
                String date = read.nextLine();

                System.out.println("Your date is " + date + "\n1.Correct \n2.Change date");

            } else if (response == 0) {
                showDoctorMenu();
            }

        } while (response != 0);
    }
}
