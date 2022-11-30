package ru.mirea.practice.task9;

public interface FurnitureFactory {
    Chair createChair(double cost, double weight, String color);

    CoffeeTable createCoffeeTable(double cost, double weight, String color);

    Sofa createSofa(double cost, double weight, String color);
}
