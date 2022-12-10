package ru.mirea.practice.task3;

public class Dog implements Nameable {
    public String name;
    public double weight;
    public double large;

    public Dog(String name, double weight, double large) {
        this.name = name;
        this.weight = weight;
        this.large = large;
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", large=" + large +
                '}';
    }
}
