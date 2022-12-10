package ru.mirea.practice.task3;

public class Car implements Nameable {
    private int speed;
    private String name;

    public Car(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public String getName() {
        return name;
    }
}
