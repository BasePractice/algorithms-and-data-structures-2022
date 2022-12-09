package ru.mirea.practice.ex10;

public abstract class Transport {
    public abstract double shipTime();

    public abstract double shipCost(int passengersQuantity);

    public abstract double shipCost(double cargoWeight);

    public double shipCost(int passengersQuantity, double cargoWeight) {
        return shipCost(passengersQuantity) + shipCost(cargoWeight);
    }
}
