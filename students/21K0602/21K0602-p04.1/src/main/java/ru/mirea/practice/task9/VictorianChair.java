package ru.mirea.practice.task9;

public class VictorianChair extends Furniture implements Chair {

    public VictorianChair(double weight, double cost, String color) {
        super(weight, cost, color);
    }

    @Override
    public boolean hasLegs() {
        return true;
    }

    @Override
    public boolean sitOn() {
        return true;
    }

    @Override
    public String toString() {
        return "Victorian Chair: " + "cost = " + super.getCost() + " color = " + super.getColor() + " weight = "
                + super.getWeight() + " has legs: " + hasLegs() + " sit on: " + sitOn();
    }
}
