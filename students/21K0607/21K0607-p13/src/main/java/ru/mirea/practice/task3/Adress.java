package ru.mirea.practice.task3;


import java.util.StringTokenizer;

public class Adress {
    private final String userCountry;
    private final String userCity;
    private final String userStreet;
    private final String userHouse;
    private final String userHousePart;
    private final String userFlat;


    public Adress(String address) {
        StringTokenizer stringTokenizer = new StringTokenizer(address, ".,;");
        String[] tempArray = new String[stringTokenizer.countTokens()];
        int i = 0;

        while (stringTokenizer.hasMoreTokens()) {
            tempArray[i++] = stringTokenizer.nextToken();
        }
        if (tempArray.length < 6) {
            System.out.println("not enough information");
        }
        userHousePart = tempArray[4].replace(" ", "");
        userCity = tempArray[1].replace(" ", "");
        userHouse = tempArray[3].replace(" ", "");
        userFlat = tempArray[5].replace(" ", "");
        userCountry = tempArray[0].replace(" ", "");
        userStreet = tempArray[2].replace(" ", "");

    }

    public String getUserCountry() {
        return userCountry;
    }

    public String getUserStreet() {
        return userStreet;
    }

    public String getUserHouse() {
        return userHouse;
    }


    public String getUserHousePart() {
        return userHousePart;
    }

    public String getUserFlat() {
        return userFlat;
    }

    public String getUserCity() {
        return userCity;
    }

    public String getAddress() {
        return userCountry + " " + userCity + " " + userStreet + " " + userHouse + " " + userHousePart + " " + userFlat;
    }

    @Override
    public String toString() {
        return "Adress" + "userCountry='" + userCountry + '\'' + ", userCity='" + userCity + '\'' + ", userStreet='" + userStreet + '\''
                + ", userHouse='" + userHouse + '\'' + ", userHousePart='" + userHousePart + '\'' + ", userFlat='" + userFlat + '\'';
    }
}
