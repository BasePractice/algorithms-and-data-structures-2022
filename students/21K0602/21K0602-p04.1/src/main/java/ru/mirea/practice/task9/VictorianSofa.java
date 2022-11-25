package ru.mirea.practice.task9;

public class VictorianSofa extends Furniture implements Sofa {

    public VictorianSofa(double weight, double cost, String color) {
        super(weight, cost, color);
    }

    @Override
    public boolean hasLegs() {
        return true;
    }

    @Override
    public boolean soft() {
        return true;
    }

    @Override
    public String toString() {
        return "Victorian Sofa: " + "cost = " + super.getCost() + " color " + super.getColor() + " weight "
                + super.getWeight() + " has legs: " + hasLegs() + " soft: " + soft();
    }
}
