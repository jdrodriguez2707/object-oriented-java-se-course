package model;

import java.util.ArrayList;
import java.util.Date;

/*
    En la práctica, todos los atributos de una clase deberían ser privados y solo acceder a ellos
    a través de los métodos getter y setter.
 */
public class Patient extends User {
    // Encapsulation
    // Attributes
    private String birthday;
    private double weight;
    private double height;
    private String blood;

    private ArrayList<AppointmentDoctor> appointmentDoctors = new ArrayList<>();
    private ArrayList<AppointmentNurse> appointmentNurses = new ArrayList<>();

    // Default constructor
    public Patient() {
    }

    // Constructor with parameters
    public Patient(String name, String email) {
        super(name, email);
    }

    // Getters and Setters
    public ArrayList<AppointmentDoctor> getAppointmentDoctors() {
        return appointmentDoctors;
    }

    public void addAppointmentDoctors(Doctor doctor, Date date, String time) {
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
