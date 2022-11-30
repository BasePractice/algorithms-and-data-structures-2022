package ru.mirea.practice.task10;

public class Auto extends Vehicle {

    public Auto(double tripTime, int seatsNumber) {
        super(tripTime, seatsNumber);
        this.tripCoast = tripTime * 4.7 * seatsNumber;
    }

    @Override
    public double getTripCoast() {
        return this.tripCoast;
    }
}
