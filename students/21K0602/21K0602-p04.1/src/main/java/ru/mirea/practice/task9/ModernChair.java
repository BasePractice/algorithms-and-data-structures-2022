package ru.mirea.practice.task9;

public class ModernChair extends Furniture implements Chair {

    public ModernChair(double weight, double cost, String color) {
        super(weight, cost, color);
    }

    @Override
    public boolean hasLegs() {
        return false;
    }

    @Override
    public boolean sitOn() {
        return true;
    }

    @Override
    public String toString() {
        return "Modern Chair: " + "cost = " + super.getCost() + " color = " + super.getColor() + " weight = "
                + super.getWeight() + " has legs: " + hasLegs() + " sit on: " + sitOn();
    }
}
