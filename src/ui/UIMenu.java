package ui;

import model.Doctor;
import model.Patient;
import java.util.ArrayList;
import java.util.Scanner;

public class UIMenu {
    public static Doctor doctorLogged;
    public static Patient patientLogged;

    enum Month {
        JANUARY("January"),
        FEBRUARY("February"),
        MARCH("March"),
        APRIL("April"),
        MAY("May"),
        JUNE("June"),
        JULY("July"),
        AUGUST("August"),
        SEPTEMBER("September"),
        OCTOBER("October"),
        NOVEMBER("November"),
        DECEMBER("December");

        private final String lowercase;

        Month(String lowercase) {
            this.lowercase = lowercase;
        }

        public String getLowercase() {
            return lowercase;
        }
    }

    public static void showMenu() {
        Scanner read = new Scanner(System.in);
        int response = 0;

        System.out.println("\nWelcome to My Appointments🏥");
        System.out.println("\nSelect the desired option: ");

        do {
            System.out.println("1. Doctor👨🏻‍⚕️");
            System.out.println("2. Patient👩🏻‍🦱");
            System.out.println("0. Exit🚪");
            response = Integer.parseInt(read.nextLine());

            switch (response) {
                case 1 -> {
                    response = 0;
                    authUser(1);
                }
                case 2 -> {
                    response = 0;
                    authUser(2);
                }
                case 0 -> System.out.println("Thank you for your visit😉");
                default -> System.out.println("Please select a correct option");
            }
        } while (response != 0);

        read.close();
    }

    private static void authUser(int userType) {
        // userType = 1 -> Doctor
        // userType = 2 -> Patient

        Scanner read = new Scanner(System.in);
        boolean isEmailCorrect = false;

        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("Steban Guerrero", "steban@mail.com"));
        doctors.add(new Doctor("Diego Padilla", "diego@mail.com"));
        doctors.add(new Doctor("Johan Rodriguez", "johan@mail.com"));

        ArrayList<Patient> patients = new ArrayList<>();
        patients.add(new Patient("Nerys Castro", "nerys@mail.com"));
        patients.add(new Patient("Kelly Castro", "kelly@mail.com"));
        patients.add(new Patient("Jhon Rodriguez", "jhon@mail.com"));

        do {
            System.out.println("\nEnter your email address: [mail@mail.com]");
            String email = read.nextLine();

            if (userType == 1) {
                for (Doctor doctor : doctors) {
                    if (doctor.getEmail().equals(email)) {
                        isEmailCorrect = true;
                        doctorLogged = doctor;
                        UIDoctorMenu.showDoctorMenu();
                    }
                }
            }

            if (userType == 2) {
                for (Patient patient : patients) {
                    if (patient.getEmail().equals(email)) {
                        isEmailCorrect = true;
                        patientLogged = patient;
                        UIPatientMenu.showPatientMenu();
                    }
                }
            }
        } while (!isEmailCorrect);
    }
}
