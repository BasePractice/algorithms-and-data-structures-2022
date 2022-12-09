package ru.mirea.practice.ex10;

public class Airplane extends Transport {

    @Override
    public double shipTime() {
        return 1.5;
    }

    @Override
    public double shipCost(int passengersQuantity) {
        return passengersQuantity * 10000;
    }

    @Override
    public double shipCost(double cargoWeight) {
        return cargoWeight * 900;
    }
}
