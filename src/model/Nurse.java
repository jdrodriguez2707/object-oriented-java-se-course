package model;

public class Nurse extends User {
    private String speciality;

    public Nurse() {
    }

    public Nurse(String name, String email) {
        super(name, email);
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public void showDataUser() {
        System.out.println("Hospital employee: Clínica General del Norte");
        System.out.println("Departments: Pediatrics, gynecology");
    }
}
