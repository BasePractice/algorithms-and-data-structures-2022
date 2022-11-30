package ru.mirea.practice.task10;

public class Plane extends Vehicle {

    public Plane(double tripTime, int seatsNumber) {
        super(tripTime, seatsNumber);
        this.tripCoast = tripTime * 14.2 * seatsNumber;
    }

    @Override
    public double getTripCoast() {
        return this.tripCoast;
    }
}
