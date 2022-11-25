package ru.mirea.workfourone.task10;

public class Plane extends Transport {
    protected double averageSpeed;

    public Plane() {
        // constructor
    }

    public Plane(double pricePerKilometer, double multiplierPerKilogram, double averageSpeed) {
        super(pricePerKilometer, multiplierPerKilogram);
        this.averageSpeed = averageSpeed;
    }

    public Plane(double pricePerKilometer, double averageSpeed) {
        super(pricePerKilometer);
        this.averageSpeed = averageSpeed;
    }

    public double getAverageSpeed() {
        return averageSpeed;
    }

    public void setAverageSpeed(double averageSpeed) {
        this.averageSpeed = averageSpeed;
    }

    @Override
    double getTime(double distance) {
        return distance / this.averageSpeed;
    }

    @Override
    double getPassengerPrice(double distance) {
        return this.pricePerKilometer * distance;
    }

    @Override
    double getCargoPrice(double distance, double cargoWeight) {
        return this.pricePerKilometer * this.multiplierPerKilogram * cargoWeight * distance;
    }

    @Override
    public String toString() {
        return "Plane{" + "averageSpeed=" + averageSpeed + ", pricePerKilometer=" + pricePerKilometer + ", multiplierPerKilogram="
                + multiplierPerKilogram + '}';
    }

}
