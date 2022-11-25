package ru.mirea.practice.task10;

public abstract class Vehicle {
    protected double time;

    protected double cost;
    protected double seats;

    public Vehicle(double time, double seats) {
        this.time = time;
        this.seats = seats;
        cost = 0;
    }

    public abstract double tripCoast();

}
