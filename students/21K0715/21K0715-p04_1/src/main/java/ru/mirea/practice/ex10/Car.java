package ru.mirea.practice.ex10;

public class Car extends Transport {

    @Override
    public double shipTime() {
        return 8;
    }

    @Override
    public double shipCost(int passengersQuantity) {
        return passengersQuantity * 300;
    }

    @Override
    public double shipCost(double cargoWeight) {
        return cargoWeight * 100;
    }
}
