package ru.mirea.practice.task10;

public class Plane extends Vehicle {


    public Plane(double time, double seats) {
        super(time, seats);
        cost = seats * time * 160;
    }

    @Override
    public double tripCoast() {
        return cost;
    }
}
