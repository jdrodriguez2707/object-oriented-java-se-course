package model;

import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.util.ArrayList;

public class Doctor extends User {
    private String speciality;
    private final ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();

    public Doctor() {}

    public Doctor(String name, String email) {
        super(name, email);
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public void addAvailableAppointment(String date, String time) {
        availableAppointments.add(new AvailableAppointment(date, time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointments() {
        return availableAppointments;
    }

    @Override
    public String toString() {
        return super.toString() + "Speciality: " + speciality + "\n" + "Available Appointments: " + "\n" + availableAppointments;
    }

    @Override
    public void showDataUser() {
        System.out.println("Hospital employee: Clínica General del Norte");
        System.out.println("Department: Endocrinology");
    }

    public static class AvailableAppointment {
        private int id;
        private LocalDate date;
        private String time;
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        public AvailableAppointment() {}

        public AvailableAppointment(String date, String time) {
            this.date = LocalDate.parse(date, format);
            this.time = time;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public LocalDate getDate(String DATE) {
            return date;
        }

        public String getDate() {
            return date.format(format);
        }

        public void setDate(LocalDate date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        @Override
        public String toString() {
            return "Appointment " + "\n" + "Date: " + date + "\n" + "Time: " + time + "\n";
        }
    }
}
