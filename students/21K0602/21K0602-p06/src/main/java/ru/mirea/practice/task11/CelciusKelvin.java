package ru.mirea.practice.task11;

public class CelciusKelvin implements Convertable {


    @Override
    public Double convert(Double temperature, String system) {
        if ("Celcius".equals(system)) {
            return temperature - 273.15;
        } else if ("Kelvin".equals(system)) {
            return temperature + 273.15;

        } else {
            System.out.println("wrong format");
            return 0.0;
        }

    }
}
