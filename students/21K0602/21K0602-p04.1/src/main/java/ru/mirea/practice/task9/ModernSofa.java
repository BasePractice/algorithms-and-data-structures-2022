package ru.mirea.practice.task9;

public class ModernSofa extends Furniture implements Sofa {
    public ModernSofa(double weight, double cost, String color) {
        super(weight, cost, color);
    }

    @Override
    public boolean hasLegs() {
        return false;
    }

    @Override
    public boolean soft() {
        return true;
    }

    @Override
    public String toString() {
        return "Modern Sofa " + "cost = " + super.getCost() + " color = " + super.getColor() + " weight = "
                + super.getWeight() + " soft: " + soft() + " has legs: " + hasLegs();
    }
}
