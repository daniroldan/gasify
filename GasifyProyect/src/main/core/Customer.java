package main.core;

public class Customer {

    private String name;
    private String dni;
    private String address;

    public Customer(String name, String dni, String address) {
        this.name = name;
        this.dni = dni;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", dni='" + dni + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
