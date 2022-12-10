package ru.mirea.practice.task3;

public class Planet implements Nameable {
    private String name;
    private double weight;

    public Planet(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Planet{" + "name='" + name + '\'' + ", weight=" + weight + '}';
    }
}
