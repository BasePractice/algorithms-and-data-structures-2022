package ru.mirea.practice.ex4;

public class Computer {
    private final String name;

    public Computer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Computer{"
                + "name='" + name + '\''
                + '}';
    }
}
