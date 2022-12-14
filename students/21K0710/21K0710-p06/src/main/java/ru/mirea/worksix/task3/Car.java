package ru.mirea.worksix.task3;

public class Car implements Nameable {
    private final String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Car{" + "name='" + name + '\'' + '}';
    }

    @Override
    public String getName() {
        return this.name;
    }
}
