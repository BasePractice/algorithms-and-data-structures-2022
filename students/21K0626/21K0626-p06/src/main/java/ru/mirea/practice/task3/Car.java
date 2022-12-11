package ru.mirea.practice.task3;

public class Car implements Nameable {
    public String name;
    public double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }


    @Override
    public String getName() {
        return name;
    }
}
