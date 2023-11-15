package ui;

import model.Doctor;

import java.util.ArrayList;
import java.util.Scanner;

public class UIDoctorMenu {
    public static ArrayList<Doctor> doctorsAvailableAppointments = new ArrayList<>();

    public static void showDoctorMenu() {
        int response = 0;
        Scanner read = new Scanner(System.in);

        do {
            System.out.println("\nDoctor👨🏻‍⚕️");
            System.out.println("Welcome " + UIMenu.doctorLogged.getName());
            System.out.println("1. Add available appointment📅");
            System.out.println("0. Logout🚪");
            response = Integer.parseInt(read.nextLine());

            switch (response) {
                case 1 -> {
                    response = 0;
                    showAddAvailableAppointmentsMenu();
                }
                case 0 -> UIMenu.showMenu();
            }
        } while (response != 0);

        read.close();
    }

    private static void showAddAvailableAppointmentsMenu() {
        int response = 0;
        Scanner read = new Scanner(System.in);

        do {
            System.out.println();
            System.out.println("\n::Add available appointment📅");
            System.out.println("Select a month: ");
            for (int i = 1; i < 4; i++) {
                System.out.println(i + ". " + UIMenu.Month.values()[i - 1].getLowercase());
            }
            System.out.println("0. Return◀️");
            response = Integer.parseInt(read.nextLine());

            if (response > 0 && response < 4) {
                // 1,2,3
                int monthSelected = response;
                System.out.println("\n" + monthSelected + ". " + UIMenu.Month.values()[monthSelected - 1].getLowercase());
                System.out.println("\nEnter the date available: [dd/mm/yyyy]");
                String date = read.nextLine();

                System.out.println("Your date is " + date + "\n1. Correct \n2. Change date");
                int responseDate = Integer.parseInt(read.nextLine());
                if (responseDate == 2) continue;

                int responseTime;
                String time;

                do {
                    System.out.println("\nEnter the time available for the date " + date + ": [16:00]");
                    time = read.nextLine();
                    System.out.println("Your time is " + time + "\n1. Correct \n2. Change time");
                    responseTime = Integer.parseInt(read.nextLine());
                } while (responseTime == 2);

                UIMenu.doctorLogged.addAvailableAppointment(date, time);
                checkDoctorAvailableAppointments(UIMenu.doctorLogged);

            } else if (response == 0) {
                showDoctorMenu();
                read.close();
            }

        } while (response != 0);
    }

    private static void checkDoctorAvailableAppointments(Doctor doctor) {
        if (!doctor.getAvailableAppointments().isEmpty() && !doctorsAvailableAppointments.contains(doctor)) {
            doctorsAvailableAppointments.add(doctor);
        }
    }
}
