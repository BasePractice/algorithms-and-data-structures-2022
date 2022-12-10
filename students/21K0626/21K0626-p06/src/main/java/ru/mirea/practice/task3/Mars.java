package ru.mirea.practice.task3;

public class Mars implements Nameable {
    public String name;
    public double radius;


    public Mars(String name, double radius) {
        this.name = name;
        this.radius = radius;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Mars{" +
                "name='" + name + '\'' +
                ", radius=" + radius +
                '}';
    }
}
