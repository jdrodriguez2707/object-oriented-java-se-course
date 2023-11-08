import model.Doctor;
// import static ui.UIMenu.showMenu;
import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
        // Create new doctor
        Doctor doctor1 = new Doctor("Johan Rodriguez", "johandavid.jdr@gmail.com", "Endocrinology");

        // Create new available appointments
        doctor1.addAvailableAppointment(LocalDate.now(), "10:00 a.m");
        doctor1.addAvailableAppointment(LocalDate.now(), "1:00 p.m");
        doctor1.addAvailableAppointment(LocalDate.of(2023, 11, 2), "4:00 p.m");

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
