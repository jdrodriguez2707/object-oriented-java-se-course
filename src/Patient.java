/*
    En la práctica, todos los atributos de una clase deberían ser privados y solo acceder a ellos
    a través de los métodos getter y setter.
 */
public class Patient {
    // Encapsulation
    // Attributes
    private static int nextId = 0;
    private int id;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;
    private String birthday;
    private double weight;
    private double height;
    private String blood;

    // Default constructor
    public Patient() {}

    // Constructor with parameters
    public Patient(String name, String email) {
        id = ++nextId;
        this.name = name;
        this.email = email;
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

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() != 8) {
            System.out.println("The phone number must be 8 digits");
        } else {
            this.phoneNumber = phoneNumber;
        }
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
