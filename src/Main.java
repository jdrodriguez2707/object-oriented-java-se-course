import static ui.UIMenu.showMenu;
//import static java.lang.Math.*;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Doctor myDoctor = new Doctor("Johan", "Endocrinology");
        myDoctor.addAvailableAppointment(LocalDate.now(), "10:00 a.m");
        myDoctor.addAvailableAppointment(LocalDate.now(), "1:00 p.m");
        myDoctor.addAvailableAppointment(LocalDate.of(2023, 11, 2), "4:00 p.m");

        for (Doctor.AvailableAppointment availableAppointment : myDoctor.getAvailableAppointments()) {
            System.out.println("Appointment " + availableAppointment.getId() + " " + availableAppointment.getDate() + " " + availableAppointment.getTime());
        }

        /*
        Doctor doctor1 = new Doctor("Johan Rodriguez", "Endocrinology");
        System.out.println(doctor1.name);
        System.out.println(doctor1.speciality);

        Patient patient1 = new Patient("Nerys Castro", "nerys@mail.com");
        patient1.setWeight(54.1);
        System.out.println(patient1.getWeight());
        patient1.setHeight(1.72);
        System.out.println(patient1.getHeight());
        patient1.setPhoneNumber("12345678");
        System.out.println(patient1.getPhoneNumber());

        // Esto es un objeto llamado 'name' de la clase 'String'
        // String name;
        */

        //showMenu();

        /* Doctor 1
        Doctor myDoctor = new Doctor();
        myDoctor.name = "Steban Guerrero";
        System.out.println(" ");
        myDoctor.showName();
        myDoctor.showId();


        System.out.println(" ");

        Doctor 2
        Doctor newDoctor = new Doctor();
        newDoctor.name = "Johan Rodriguez";
        System.out.println(" ");
        newDoctor.showName();
        newDoctor.showId();

        System.out.println(random());
        */

        /*int i = 0;
        int b = 1;
        i = b;
        i = 2;*/

        /*
        System.out.println(i);
        System.out.println(b);
        */

        /*Patient myPatient1 = new Patient("Johan Rodriguez", "johan@gmail.com");
        Patient myPatient2 = new Patient("Steban Guerrero", "steban@gmail.com");

        System.out.println(myPatient1.getName());
        System.out.println(myPatient2.getName());

        myPatient1 = myPatient2;

        System.out.println(myPatient1.getName());
        System.out.println(myPatient2.getName());

        myPatient1.setName("Juan Rodriguez");

        System.out.println(myPatient1.getName());
        System.out.println(myPatient2.getName());*/
    }
}
