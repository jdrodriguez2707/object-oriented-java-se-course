package ui;

import model.Doctor;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

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
                case 1 -> showBookAppointmentMenu();
                case 2 -> showPatientMyAppointments();
                case 0 -> UIMenu.showMenu();
            }
        } while (response != 0);
    }

    private static void showBookAppointmentMenu() {
        int response = 0;

        do {
            System.out.println("::Book an appointment");
            System.out.println("::Select a date: ");
            Map<Integer, Map<Integer, Doctor>> doctors = new TreeMap<>();
            int k = 0;

            for (int i = 0; i < UIDoctorMenu.doctorsAvailableAppointments.size(); i++) {
                ArrayList<Doctor.AvailableAppointment> availableAppointments =
                        UIDoctorMenu.doctorsAvailableAppointments.get(i).getAvailableAppointments();

                Map<Integer, Doctor> doctorAppointments = new TreeMap<>();

                for (int j = 0; j < availableAppointments.size(); j++) {
                    k++;
                    System.out.println(k + ". " + availableAppointments.get(j).getDate());
                    doctorAppointments.put(j, UIDoctorMenu.doctorsAvailableAppointments.get(i));
                    doctors.put(k, doctorAppointments);
                }
            }

            Scanner read = new Scanner(System.in);
            int responseDateSelected = Integer.parseInt(read.nextLine());

            Map<Integer, Doctor> doctorAvailableSelected = doctors.get(responseDateSelected);
            Integer indexDate = 0;
            Doctor doctorSelected = new Doctor("", "");

            for (Map.Entry<Integer, Doctor> doc : doctorAvailableSelected.entrySet()) {
                indexDate = doc.getKey();
                doctorSelected = doc.getValue();
            }

            System.out.println(doctorSelected.getName() + ". Date: " + doctorSelected.getAvailableAppointments().get(indexDate).getDate() + ". Time: " + doctorSelected.getAvailableAppointments().get(indexDate).getTime());

            System.out.println("Confirm your appointment: \n1. Yes \n2. Change data");
            response = Integer.parseInt(read.nextLine());

            if (response == 1) {
                UIMenu.patientLogged.addAppointmentDoctors(
                        doctorSelected,
                        doctorSelected.getAvailableAppointments().get(indexDate).getDate(null),
                        doctorSelected.getAvailableAppointments().get(indexDate).getTime()
                );

                showPatientMenu();
            }

        } while (response != 0);
    }

    private static void showPatientMyAppointments() {
        int response = 0;

        do {
            System.out.println("::My appointments");
            if (UIMenu.patientLogged.getAppointmentDoctors().size() == 0) {
                System.out.println("Don't have appointments");
                break;
            }

            for (int i = 0; i < UIMenu.patientLogged.getAppointmentDoctors().size(); i++) {
                System.out.println((i + 1) + ". " + "Date: " + UIMenu.patientLogged.getAppointmentDoctors().get(i).getDate() + "Time: " + UIMenu.patientLogged.getAppointmentDoctors().get(i).getTime() + "\n" + "Doctor: " + UIMenu.patientLogged.getAppointmentDoctors().get(i).getDoctor().getName());
            }

            System.out.println("0. Return");
        } while (response != 0);
    }
}
