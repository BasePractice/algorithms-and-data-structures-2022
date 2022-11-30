package ru.mirea.practice.task9;

public abstract class Furniture {
    private double weight;
    private double cost;
    private String color;

    public Furniture(double weight, double cost, String color) {
        this.weight = weight;
        this.cost = cost;
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public double getCost() {
        return cost;
    }

    public String getColor() {
        return color;
    }


}
