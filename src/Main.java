import static ui.UIMenu.showMenu;
//import static java.lang.Math.*;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Create new doctor
        Doctor doctor1 = new Doctor("Johan Rodriguez", "Endocrinology");

        // Create new appointments
        doctor1.addAvailableAppointment(LocalDate.now(), "1:00 p.m");
        doctor1.addAvailableAppointment(LocalDate.of(2023, 12, 2), "10:00 a.m");
        doctor1.addAvailableAppointment(LocalDate.of(2023, 11, 7), "3:30 p.m");

        // Show available appointments
        System.out.println("The name of the doctor is: " + doctor1.getName() + "\n");

        for (Doctor.AvailableAppointment availableAppointment : doctor1.getAvailableAppointments()) {
            System.out.println("Id: " + availableAppointment.getId() + "\n" + "Date: " + availableAppointment.getDate() + "\n" + "Time: " + availableAppointment.getTime() + "\n");
        }
    }
}
