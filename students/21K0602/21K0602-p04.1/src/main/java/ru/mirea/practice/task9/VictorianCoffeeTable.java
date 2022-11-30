package ru.mirea.practice.task9;

public class VictorianCoffeeTable extends Furniture implements CoffeeTable {


    public VictorianCoffeeTable(double weight, double cost, String color) {
        super(weight, cost, color);
    }

    @Override
    public boolean hasSmartScreen() {
        return false;
    }

    @Override
    public boolean hasGoldDecoration() {
        return true;
    }

    @Override
    public String toString() {
        return "Victorian coffee table: " + "cost = " + super.getCost() + " color = " + super.getColor() + " weight = "
                + super.getWeight() + " has Gold Decoration: " + hasGoldDecoration() + " has Smart Screen: "
                + hasSmartScreen();
    }
}
