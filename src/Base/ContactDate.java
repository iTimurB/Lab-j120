package Base;

import java.io.Serializable;

public class ContactDate implements Serializable {

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
        ContactDate cd = (ContactDate) o;
        if (street != cd.street) {
            return false;
        }
        if (numberBuild != cd.numberBuild) {
            return false;
        }
        if (numderOffice != cd.numderOffice) {
            return false;
        }
        return city.equals(cd.city);
    }

    @Override
    public int hashCode() {
        int res = city.hashCode();
        res = 31 * res + street.hashCode();
        res = 31 * res + numberBuild;
        res = 31 * res + numderOffice;
        return res;
    }

    @Override
    public String toString() {
        return "Address{" + "city=" + city + ", street=" + street + ", numberBuild=" + numberBuild + ", numderOffice=" + numderOffice + '}';
    }

}
