package ru.mirea.practice.task10;

public class Train extends Vehicle {

    public Train(double time, double seats) {
        super(time, seats);
        cost = seats * time * 40;
    }

    @Override
    public double tripCoast() {
        return cost;
    }
}
