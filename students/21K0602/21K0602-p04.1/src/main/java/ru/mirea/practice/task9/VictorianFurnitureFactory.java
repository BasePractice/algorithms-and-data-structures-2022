package ru.mirea.practice.task9;

public class VictorianFurnitureFactory implements FurnitureFactory {

    @Override
    public Chair createChair(double cost, double weight, String color) {
        return new VictorianChair(weight, cost, color);
    }

    @Override
    public CoffeeTable createCoffeeTable(double cost, double weight, String color) {
        return new VictorianCoffeeTable(weight, cost, color);
    }

    @Override
    public Sofa createSofa(double cost, double weight, String color) {
        return new VictorianSofa(weight, cost, color);
    }
}
