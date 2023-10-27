import java.time.LocalDate;
import java.util.ArrayList;

public class Doctor extends User {
    /*
    //Autoincrement
    private static int nextId = 0; // Aquí al usar static estamos creando una variable propia de la clase y su valor va a ser igual en tiempo real para todos los objetos
    private int id; // Variable propia de cada objeto
    */

    private String speciality;

    // Método constructor
    public Doctor() {
    }

    public Doctor(String name, String email, String speciality) {
        super(name, email);
        this.speciality = speciality;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();

    public void addAvailableAppointment(LocalDate date, String time) {
        availableAppointments.add(new AvailableAppointment(date, time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointments() {
        return availableAppointments;
    }

    /*
     La clase Appointment está definida como una clase interna estática dentro de la clase Doctor. Esto significa que cada instancia de Doctor comparte la misma definición de Appointment, y no es necesario crear una instancia de Doctor para crear una instancia de Appointment. Esto se debe a que las clases internas estáticas se asocian directamente con la clase externa, no con instancias específicas de la clase externa.
     */
    public static class AvailableAppointment {
        private LocalDate date;
        private String time;

        public AvailableAppointment() {
        }

        public AvailableAppointment(LocalDate date, String time) {
            this.date = date;
            this.time = time;
        }

        public LocalDate getDate() {
            return date;
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
    }
}
