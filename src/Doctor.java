import java.time.LocalDate;
import java.util.ArrayList;

public class Doctor {
    //Autoincrement
    private static int nextId = 0; // Aquí al usar static estamos creando una variable propia de la clase y su valor va a ser igual en tiempo real para todos los objetos
    private int id; // Variable propia de cada objeto
    private String name;
    private String speciality;


    // Método constructor
    public Doctor() {
        System.out.println("Building the doctor object");
    }

    public Doctor(String name, String speciality) {
        id = ++nextId;
        this.name = name;
        this.speciality = speciality;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public static class AvailableAppointment {
        private static int nextId = 0;
        private int id;
        private LocalDate date;
        private String time;

        public AvailableAppointment() {
        }

        public AvailableAppointment(LocalDate date, String time) {
            id = ++nextId;
            this.date = date;
            this.time = time;
        }

        public int getId() {
            return id;
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
