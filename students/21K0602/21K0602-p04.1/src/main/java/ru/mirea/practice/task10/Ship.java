package ru.mirea.practice.task10;

public class Ship extends Vehicle {
    public Ship(double time, double seats) {
        super(time, seats);
        cost = seats * time * 150;
    }

    @Override
    public double tripCoast() {
        return cost;
    }
}
