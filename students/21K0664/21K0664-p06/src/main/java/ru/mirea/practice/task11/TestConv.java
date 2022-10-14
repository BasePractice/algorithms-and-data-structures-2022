package ru.mirea.practice.task11;

import java.util.Objects;

public class TestConv implements Convertable {
    //Задание 6.11
    public void convert(double temperature, String name) {
        if (Objects.equals(name, "Celsia")) {
            double temperatureK = temperature + 273;
            double temperatureF = temperature * 1.8 + 32;
            System.out.println("Kelvin = " + temperatureK + "\nFarengeith = " + temperatureF);
        } else if (Objects.equals(name, "Kelvin")) {
            double temperatureC = temperature - 273;
            double temperatureF = temperatureC * 1.8 + 32;
            System.out.println("Celsia = " + temperatureC + "\nFarengeith = " + temperatureF);
        } else {
            double temperatureC = (temperature - 32) / 1.8;
            double temperatureK = temperatureC + 273;
            System.out.println("Celsia = " + temperatureC + "\nKelvin = " + temperatureK);
        }
    }
}
