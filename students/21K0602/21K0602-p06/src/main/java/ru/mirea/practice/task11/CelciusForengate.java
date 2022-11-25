package ru.mirea.practice.task11;

public class CelciusForengate implements Convertable {

    @Override
    public Double convert(Double temperature, String system) {
        if ("Celcius".equals(system)) {
            return (9 / 5) * temperature + 32;
        } else if ("Forenfate".equals(system)) {
            return (5 / 9) * (temperature - 32);

        } else {
            System.out.println("wrong format");
            return 0.0;
        }
    }
}
