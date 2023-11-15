package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Patient extends User {
    private String birthday;
    private double weight;
    private double height;
    private String blood;
    private final ArrayList<AppointmentDoctor> appointmentDoctors = new ArrayList<>();
    private ArrayList<AppointmentNurse> appointmentNurses = new ArrayList<>();

    public Patient() {}

    // Constructor with parameters
    public Patient(String name, String email) {
        super(name, email);
    }

    // Getters and Setters
    public ArrayList<AppointmentDoctor> getAppointmentDoctors() {
        return appointmentDoctors;
    }

    public void addAppointmentDoctors(Doctor doctor, LocalDate date, String time) {
        AppointmentDoctor appointmentDoctor = new AppointmentDoctor(this, doctor);
        appointmentDoctor.schedule(date, time);
        appointmentDoctors.add(appointmentDoctor);
    }

    public ArrayList<AppointmentNurse> getAppointmentNurses() {
        return appointmentNurses;
    }

    public void setAppointmentNurses(ArrayList<AppointmentNurse> appointmentNurses) {
        this.appointmentNurses = appointmentNurses;
    }

    public String getWeight() {
        return weight + " Kg";
    }
    
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return height + " Mts";
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    @Override
    public String toString() {
        return super.toString() + "Birthday: " + birthday + "\n"
                + "Weight: " + getWeight() + "\n" + "Height: " + getHeight()
                + "\n" + "Blood: " + blood;
    }

    @Override
    public void showDataUser() {
        System.out.println("Patient");
        System.out.println("Medical history since birth");
    }
}
