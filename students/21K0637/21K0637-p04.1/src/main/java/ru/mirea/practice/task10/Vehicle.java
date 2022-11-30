package ru.mirea.practice.task10;

public abstract class Vehicle {
    protected double tripTime;
    protected double tripCoast;
    protected int seatsNumber;

    public Vehicle(double tripTime, int seatsNumber) {
        this.tripTime = tripTime;
        this.seatsNumber = seatsNumber;
    }

    public abstract double getTripCoast();
}
