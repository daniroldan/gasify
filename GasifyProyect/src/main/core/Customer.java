package main.core;

public class Customer {

    private String idCustomer;
    private String nameCustomer;
    private String numberPhone;
    private String address;

    public Customer(String idCustomer,String nameCustomer, String numberPhone, String address) {
        this.idCustomer = idCustomer;
        this.nameCustomer=nameCustomer;
        this.numberPhone = numberPhone;
        this.address = address;
    }

    public Customer() {

    }

    public void setNameCustomer(String nameCustomer){

        this.nameCustomer= nameCustomer;
    }

    public String getNameCustomer(){

        return this.nameCustomer;
    }
    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;

    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
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
                "idCustomer='" + idCustomer + '\'' +
                ", nameCustomer='" + nameCustomer + '\'' +
                ", numberPhone='" + numberPhone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}