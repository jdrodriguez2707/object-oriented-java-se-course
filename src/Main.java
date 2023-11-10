import model.*;
import static ui.UIMenu.showMenu;
import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
        showMenu();


        // Clase anonima. Tiene un corto periodo de vida
        /*User user = new User() {
            @Override
            public void showDataUser() {
                System.out.println("Doctor");
                System.out.println("Hospital: Clinica La Mercedes");
                System.out.println("Department: Odontology");
            }
        };

        user.showDataUser();

        ISchedulable schedulable = new ISchedulable() {
            @Override
            public void schedule(LocalDate date, String time) {

            }
        };

        ISchedulable schedulable1 = new AppointmentDoctor();*/

        /*User doctor = new Doctor();
        User nurse = new Nurse();
        User patient = new Patient();

        doctor.showDataUser();
        System.out.println();
        nurse.showDataUser();
        System.out.println();
        patient.showDataUser();*/


        // Create new doctor
        /*Doctor doctor1 = new Doctor("Johan Rodriguez", "johandavid.jdr@gmail.com", "Endocrinology");*/

        // Create new available appointments
        /*doctor1.addAvailableAppointment(LocalDate.now(), "10:00 a.m");
        doctor1.addAvailableAppointment(LocalDate.now(), "1:00 p.m");
        doctor1.addAvailableAppointment(LocalDate.of(2023, 11, 2), "4:00 p.m");*/

        // Las clases abstractas no pueden ser instanciadas
        // User user = new User("Johan", "johan@email.com");

        // Show available appointments
        /*System.out.println("The name of the doctor is: " + doctor1.getName() + "\n");
        for (model.Doctor.AvailableAppointment availableAppointment : doctor1.getAvailableAppointments()) {
            System.out.println("Date: " + availableAppointment.getDate() + "\n" + "Time: "
                    + availableAppointment.getTime() + "\n");
        }*/

        // System.out.println(doctor1);

        // Ligadura dinámica
        /*model.User doctor = new model.Doctor();
        model.User patient = new model.Patient();*/

        // showMenu();

        /*model.Patient patient = new model.Patient("Johan Rodriguez", "johandavid.jdr@gmail.com");
        System.out.println(patient);*/

    }
}
