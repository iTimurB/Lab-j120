package Base;

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
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o.getClass() != getClass()) {
            return false;
        }
        if (o == null) {
            return false;
        }
        Person person = (Person) o;
        if (name != person.name) {
            return false;
        }
        if (lastName != person.lastName) {
            return false;
        }
        if (address != person.address) {
            return false;
        }
        return telefonNumber.equals(person.telefonNumber);
    }
    
    @Override
    public int hashCode() {
        int res = telefonNumber.hashCode();
        res = 31 * res + name.hashCode();
        res = 31 * res + lastName.hashCode();
        res = 31 * res + address.hashCode();
        return res;
    }
    

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", lastName=" + lastName + ", address=" + address + ", telefonNumber=" + telefonNumber + '}';
    }

}
