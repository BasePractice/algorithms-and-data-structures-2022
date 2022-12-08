package ru.mirea.practice.Ex10;

public class Train extends Transport {

    @Override
    public double shipTime() {
        return 6;
    }

    @Override
    public double shipCost(int passengersQuantity) {
        return passengersQuantity * 2000;
    }

    @Override
    public double shipCost(double cargoWeight) {
        return cargoWeight * 500;
    }
}
