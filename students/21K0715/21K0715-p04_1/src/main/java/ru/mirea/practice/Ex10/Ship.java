package ru.mirea.practice.Ex10;

public class Ship extends Transport {

    @Override
    public double shipTime() {
        return 12;
    }

    @Override
    public double shipCost(int passengersQuantity) {
        return passengersQuantity * 1000;
    }

    @Override
    public double shipCost(double cargoWeight) {
        return cargoWeight * 350;
    }
}
