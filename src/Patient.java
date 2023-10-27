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

    // Default constructor
    public Patient() {
    }

    // Constructor with parameters
    public Patient(String name, String email) {
        super(name, email);
    }

    // Getters and Setters
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
}
