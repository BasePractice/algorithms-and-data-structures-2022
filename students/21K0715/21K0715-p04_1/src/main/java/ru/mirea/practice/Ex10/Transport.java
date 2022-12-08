package ru.mirea.practice.Ex10;

abstract public class Transport {
    abstract public double shipTime();
    abstract public double shipCost(int passengersQuantity);
    abstract public double shipCost(double cargoWeight);
    public double shipCost(int passengersQuantity, double cargoWeight) {
        return shipCost(passengersQuantity) + shipCost(cargoWeight);
    }
}
