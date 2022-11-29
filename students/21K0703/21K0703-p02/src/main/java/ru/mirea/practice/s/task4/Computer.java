package ru.mirea.practice.s.task4;

import java.util.Objects;

public class Computer {
    private final String brand;
    private final String model;

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Computer(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Computer {"
                + "brand='" + brand + '\''
                + ", model='" + model + '\''
                + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Computer computer = (Computer) o;
        return Objects.equals(brand, computer.brand) && Objects.equals(model, computer.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model);
    }
}
