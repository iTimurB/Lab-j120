
package lab.j120;

import java.io.Serializable;

public class ContactDate implements Serializable{

    private String city;
    private String street;
    private Integer numberBuild;
    private Integer numderOffice;

    public ContactDate(String city, String street, Integer numberBuild, Integer numderOffice) {
        this.city = city;
        this.street = street;
        this.numberBuild = numberBuild;
        this.numderOffice = numderOffice;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public Integer getNumberBuild() {
        return numberBuild;
    }

    public Integer getNumderOffice() {
        return numderOffice;
    }

    @Override
    public String toString() {
        return "Address{" + "city=" + city + ", street=" + street + ", numberBuild=" + numberBuild + ", numderOffice=" + numderOffice + '}';
    }
    
    
}
