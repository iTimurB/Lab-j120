package lab.j120;

import java.io.Serializable;

public class Person implements Serializable{

    String name;
    String lastName;
    ContactDate address;
    Integer telefonNumber;

    public Person(String name, String lastName, ContactDate address, Integer telefonNumber) {
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.telefonNumber = telefonNumber;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public ContactDate getAddress() {
        return address;
    }

    public Integer getTelefonNumber() {
        return telefonNumber;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", lastName=" + lastName + ", address=" + address + ", telefonNumber=" + telefonNumber + '}';
    }

}
