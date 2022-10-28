package ru.mirea.practice.task10;

public class Train extends Vehicle {

    public Train(double tripTime, int seatsNumber) {
        super(tripTime, seatsNumber);
        this.tripCoast = tripTime * 9.5 * seatsNumber;
    }

    @Override
    public double getTripCoast() {
        return this.tripCoast;
    }
}
