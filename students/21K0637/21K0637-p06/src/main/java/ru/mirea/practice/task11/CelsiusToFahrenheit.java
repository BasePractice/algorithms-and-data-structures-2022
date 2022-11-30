package ru.mirea.practice.task11;

public class CelsiusToFahrenheit implements Convertable {
    @Override
    public void convert(double degrees, String system) {
        if ("Celsius".equals(system)) {
            System.out.printf("Fahrenheit: %f", degrees * 1.8 + 32);
            System.out.printf("Kelvin: %f", degrees + 273);
        }
        if ("Fahrenheit".equals(system)) {
            System.out.printf("Celsius: %f", (degrees - 32) / 1.8);
            System.out.printf("Kelvin: %f", (degrees + 459.67) * 5 / 9);
        }
        if ("Kelvin".equals(system)) {
            System.out.printf("Celsius: %f", degrees - 273);
            System.out.printf("Fahrenheit: %f", degrees * 1.8 - 459.67);
        }
    }


}
