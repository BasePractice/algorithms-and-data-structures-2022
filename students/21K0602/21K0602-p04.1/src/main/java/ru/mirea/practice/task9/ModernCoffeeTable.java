package ru.mirea.practice.task9;

public class ModernCoffeeTable extends Furniture implements CoffeeTable {
    public ModernCoffeeTable(double weight, double cost, String color) {
        super(weight, cost, color);
    }

    @Override
    public boolean hasSmartScreen() {
        return true;
    }

    @Override
    public boolean hasGoldDecoration() {
        return false;
    }

    @Override
    public String toString() {
        return "Modern Coffee table: " + "cost = " + super.getCost() + " color =  " + super.getColor() + " weight = "
                + super.getWeight() + " has Gold Decoration: " + hasGoldDecoration() + " has Smart Screen: "
                + hasSmartScreen();
    }
}
