package ru.mirea.practice.task9;

public class ModernFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair(double cost, double weight, String color) {
        return new ModernChair(cost, weight, color);
    }

    @Override
    public CoffeeTable createCoffeeTable(double cost, double weight, String color) {
        return new ModernCoffeeTable(weight, cost, color);
    }

    @Override
    public Sofa createSofa(double cost, double weight, String color) {
        return new ModernSofa(weight, cost, color);
    }
}
