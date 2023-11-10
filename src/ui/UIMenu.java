package ui;
import model.Doctor;
import model.Patient;

import java.util.ArrayList;
import java.util.Scanner;

public class UIMenu {
    public static Doctor doctorLogged;
    public static Patient patientLogged;

    private enum Month {
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

        private Month(String lowercase) {
            this.lowercase = lowercase;
        }

        public String getLowercase() {
            return lowercase;
        }
    }

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
                case 1 -> {
                    System.out.println("Doctor");
                    response = 0;
                    authUser(1);
                }
                case 2 -> {
                    response = 0;
                    authUser(2);
                    showPatientMenu();
                }
                case 0 -> System.out.println("Thank you for your visit");
                default -> System.out.println("Please select a correct option");
            }
        } while (response != 0);

        read.close();
    }

    private static void authUser(int userType) {
        Scanner read = new Scanner(System.in);
        boolean isEmailCorrect = false;
        String email;

        // Doctors
        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("Steban Guerrero", "steban@gmail.com"));
        doctors.add(new Doctor("Diego Padilla", "diego@gmail.com"));
        doctors.add(new Doctor("Johan Rodriguez", "johan@gmail.com"));

        // Patients
        ArrayList<Patient> patients = new ArrayList<>();
        patients.add(new Patient("Nerys Castro", "nerys@gmail.com"));
        patients.add(new Patient("Jhon Rodriguez", "jhon@gmail.com"));
        patients.add(new Patient("Kelly Castro", "kelly@gmail.com"));

        do {
            System.out.println("Enter your email address: [youremail@gmail.com]");
            email = read.nextLine();

            if (userType == 1) {
                for (Doctor doctor : doctors) {
                    if (doctor.getEmail().equals(email)) {
                        isEmailCorrect = true;
                        doctorLogged = doctor;
                    }
                }
            }

            if (userType == 2) {
                for (Patient patient : patients) {
                    if (patient.getEmail().equals(email)) {
                        isEmailCorrect = true;
                        patientLogged = patient;
                    }
                }
            }
        } while (!isEmailCorrect);

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
                        System.out.println(i + ". " + Month.values()[i - 1].getLowercase());
                    }
                }
                case 2 -> System.out.println("::My appointments");
                case 0 -> showMenu();
                default -> System.out.println("Please select a correct option");
            }
        } while (response != 0);
    }
}
