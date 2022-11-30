package ru.mirea.workthirteen.task3;

import java.util.StringTokenizer;

public class Adress {
    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String housing;
    private String flat;

    Adress(String stroke) {
        String[] split = stroke.split(" ");
        this.country = split[0];
        this.region = split[1];
        this.city = split[2];
        this.street = split[3];
        this.house = split[4];
        this.housing = split[5];
        this.flat = split[6];
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

    @Override
    public String toString() {
        return "Adress {" + country + ',' + region + ',' + city + ',' + street + ',' + house + ',' + flat + '}';
    }

    public void print(String stroke) {
        StringTokenizer st = new StringTokenizer(stroke, " \t\n\r,.");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
