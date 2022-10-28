package ru.mirea.practice.task10;

public class Auto extends Vehicle {

    public Auto(double time, double seats) {
        super(time, seats);
        cost = seats * time * 90;
    }

    @Override
    public double tripCoast() {
        return cost;
    }
}
