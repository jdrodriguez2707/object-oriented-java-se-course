package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;

public class Doctor extends User {
    /*
    //Autoincrement
    private static int nextId = 0; // Aquí al usar static estamos creando una variable propia de la clase y su valor va a ser igual en tiempo real para todos los objetos
    private int id; // Variable propia de cada objeto
    */

    private String speciality;
    private ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();

    // Método constructor
    public Doctor() {
    }

    public Doctor(String name, String email) {
        super(name, email); // Enviar los atributos a la superclase
        // this.speciality = speciality; // Sobreescritura de constructor
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
        return super.toString() + "Speciality: " + speciality + "\n" + "Available Appointments: " + "\n" + availableAppointments.toString();
    }

    @Override
    public void showDataUser() {
        System.out.println("Hospital employee: Clínica General del Norte");
        System.out.println("Department: Endocrinology");
    }

    /*
         La clase Appointment está definida como una clase interna estática dentro de la clase model.Doctor. Esto significa que cada instancia de model.Doctor comparte la misma definición de Appointment, y no es necesario crear una instancia de model.Doctor para crear una instancia de Appointment. Esto se debe a que las clases internas estáticas se asocian directamente con la clase externa, no con instancias específicas de la clase externa.
         */
    public static class AvailableAppointment {
        private int id;
        private Date date;
        private String time;
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        public AvailableAppointment() {
        }

        public AvailableAppointment(String date, String time) {
            try {
                this.date = format.parse(date);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            this.time = time;
        }

        public Date getDate(String DATE) {
            return date;
        }

        // Retornar date como String
        public String getDate() {
            return format.format(date);
        }

        public void setDate(Date date) {
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
