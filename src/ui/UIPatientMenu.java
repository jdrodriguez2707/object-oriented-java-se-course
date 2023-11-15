package ui;

import model.Doctor;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class UIPatientMenu {
    public static void showPatientMenu() {
        int response = 0;
        Scanner read = new Scanner(System.in);

        do {
            System.out.println("\nPatient👩🏻‍🦱");
            System.out.println("Welcome " + UIMenu.patientLogged.getName());
            System.out.println("1. Book an appointment📅");
            System.out.println("2. My appointments📖");
            System.out.println("0. Logout🚪");
            response = Integer.parseInt(read.nextLine());

            switch (response) {
                case 1 -> {
                    response = 0;
                    showBookAppointmentMenu();
                }
                case 2 -> {
                    response = 0;
                    showPatientMyAppointments();
                }
                case 0 -> UIMenu.showMenu();
            }
        } while (response != 0);

        read.close();
    }

    private static void showBookAppointmentMenu() {
        int response = 0;
        Scanner read = new Scanner(System.in);

        do {
            System.out.println("\n::Book an appointment");
            System.out.println("Select a date: ");

            Map<Integer, Doctor.AvailableAppointment> availableAppointments = new TreeMap<>();
            int k = 0;

            for (Doctor doctor : UIDoctorMenu.doctorsAvailableAppointments) {
                for (Doctor.AvailableAppointment availableAppointment : doctor.getAvailableAppointments()) {
                    k++;
                    System.out.println(k + ". " + availableAppointment.getDate());
                    availableAppointments.put(k, availableAppointment);
                }
            }

            System.out.println("0. Return◀️");
            int responseDateSelected = Integer.parseInt(read.nextLine());

            if (responseDateSelected == 0) {
                showPatientMenu();
                break;
            }

            Doctor.AvailableAppointment appointmentSelected = availableAppointments.get(responseDateSelected);
            Doctor doctorSelected = findDoctorForAppointment(appointmentSelected);

            if (doctorSelected != null) {
                System.out.println("\n" + doctorSelected.getName() +
                        ". Date: " + appointmentSelected.getDate() +
                        ". Time: " + appointmentSelected.getTime());
            }

            System.out.println("Confirm your appointment: \n1. Yes \n2. Change date");
            response = Integer.parseInt(read.nextLine());

            if (response == 1) {
                UIMenu.patientLogged.addAppointmentDoctors(
                        doctorSelected,
                        appointmentSelected.getDate(null),
                        appointmentSelected.getTime()
                );

                response = 0;
                showPatientMenu();
            }

        } while (response != 0);

        read.close();
    }

    private static Doctor findDoctorForAppointment(Doctor.AvailableAppointment appointment) {
        for (Doctor doctor : UIDoctorMenu.doctorsAvailableAppointments) {
            if (doctor.getAvailableAppointments().contains(appointment)) {
                return doctor;
            }
        }
        return null;
    }


    private static void showPatientMyAppointments() {
        int response = 0;
        Scanner read = new Scanner(System.in);

        do {
            System.out.println("\n::My appointments📖");
            if (UIMenu.patientLogged.getAppointmentDoctors().isEmpty()) {
                System.out.println("Don't have appointments");
                break;
            }

            for (int i = 0; i < UIMenu.patientLogged.getAppointmentDoctors().size(); i++) {
                System.out.println("✔️" + "📅Date: " + UIMenu.patientLogged.getAppointmentDoctors().get(i).getDate() + " 🕒Time: " + UIMenu.patientLogged.getAppointmentDoctors().get(i).getTime() + "\n" + "👨🏻‍⚕️Doctor: " + UIMenu.patientLogged.getAppointmentDoctors().get(i).getDoctor().getName() + "\n");
            }

            System.out.println("0. Return◀️");
            response = Integer.parseInt(read.nextLine());

        } while (response != 0);

        showPatientMenu();
    }
}
