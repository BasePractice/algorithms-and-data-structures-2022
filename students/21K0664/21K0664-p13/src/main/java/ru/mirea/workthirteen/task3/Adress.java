package ru.mirea.workthirteen.task3;

public class Adress {
    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String housing;
    private String flat;

    Adress() {
    }

    Adress(String country, String region, String city, String street, String house, String housing, String flat) {
        this.country = country;
        this.region = region;
        this.city = city;
        this.street = street;
        this.house = house;
        this.housing = housing;
        this.flat = flat;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String getFlat() {
        return flat;
    }

    public String getHouse() {
        return house;
    }

    public String getHousing() {
        return housing;
    }

    public String getRegion() {
        return region;
    }

    public String getStreet() {
        return street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setFlat(String flat) {
        this.flat = flat;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public void setHousing(String housing) {
        this.housing = housing;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setStreet(String street) {
        this.street = street;
    }


    public void set(String v) {
        String[] split = v.split(" ");
        for (int i = 0; i < v.length() - 1; i++) {
            System.out.println(split[i]);
        }
    }
}
