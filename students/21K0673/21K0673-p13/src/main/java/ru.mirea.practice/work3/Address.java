package ru.mirea.practice.work3;

import java.util.StringTokenizer;

public class Address {
    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String building;
    private String flat;

    Address(String string, boolean a) {
        if (a) {
            String buff = (string + " ").split(" ")[0];
            this.country = buff.substring(0, buff.length() - 1);
            buff = (string + " ").split(" ")[1];
            this.region = buff.substring(0, buff.length() - 1);
            buff = (string + " ").split(" ")[2];
            this.city = buff.substring(0, buff.length() - 1);
            buff = (string + " ").split(" ")[3];
            this.house = buff.substring(0, buff.length() - 1);
            buff = (string + " ").split(" ")[4];
            this.street = buff.substring(0, buff.length() - 1);
            buff = (string + " ").split(" ")[5];
            this.building = buff.substring(0, buff.length() - 1);
            buff = (string + " ").split(" ")[6];
            this.flat = buff.substring(0, buff.length());
        } else {
            StringTokenizer st = new StringTokenizer(string);
            String buff = st.nextToken(" ");
            this.country = buff.substring(0, buff.length() - 1);
            buff = st.nextToken(" ");
            this.region = buff.substring(0, buff.length() - 1);
            buff = st.nextToken(" ");
            this.city = buff.substring(0, buff.length() - 1);
            buff = st.nextToken(" ");
            this.house = buff.substring(0, buff.length() - 1);
            buff = st.nextToken(" ");
            this.street = buff.substring(0, buff.length() - 1);
            buff = st.nextToken(" ");
            this.building = buff.substring(0, buff.length() - 1);
            buff = st.nextToken(" ");
            this.flat = buff;
        }
    }

    @Override
    public String toString() {
        return country + " " + region + " " + city + " " + street + " " + house + " " + building + " " + flat;
    }
}
