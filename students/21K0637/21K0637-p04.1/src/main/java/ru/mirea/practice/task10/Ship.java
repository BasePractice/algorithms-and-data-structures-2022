package ru.mirea.practice.task10;

public class Ship extends Vehicle {

    public Ship(double tripTime, int seatsNumber) {
        super(tripTime, seatsNumber);
        this.tripCoast = tripTime * 6.8 * seatsNumber;
    }

    @Override
    public double getTripCoast() {
        return this.tripCoast;
    }
}
