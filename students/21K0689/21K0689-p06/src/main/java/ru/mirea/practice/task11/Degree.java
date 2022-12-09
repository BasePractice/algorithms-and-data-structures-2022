package ru.mirea.practice.task11;

public class Degree implements Convertable {

    @Override
    public void convert(double degree, String system) {
        if ("Celsius".equals(system)) {
            System.out.printf("Fahrenheit: %f", degree * 1.8 + 32);
            System.out.printf("Kelvin: %f", degree + 273);
        }
        if ("Fahrenheit".equals(system)) {
            System.out.printf("Celsius: %f", (degree - 32) / 1.8);
            System.out.printf("Kelvin: %f", (degree + 459.67) * 5 / 9);
        }
        if ("Kelvin".equals(system)) {
            System.out.printf("Celsius: %f", degree - 273);
            System.out.printf("Fahrenheit: %f", degree * 1.8 - 459.67);
        } else {
            System.out.println("Error");
        }
    }
}
