package ru.mirea.practice.task4;

public class Computer implements Priceable {
    private final String cpu;
    private final String memory;
    private final String name;
    private double price;

    public Computer(String cpu, String memory, String name, double price) {
        this.cpu = cpu;
        this.memory = memory;
        this.name = name;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public String getCpu() {
        return cpu;
    }

    public String getMemory() {
        return memory;
    }

    public String getName() {
        return name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Computer{" + "cpu='" + cpu + '\'' + ", memory='" + memory + '\'' + ", name='" + name + '\'' + ", price="
                + price + '}';
    }
}
