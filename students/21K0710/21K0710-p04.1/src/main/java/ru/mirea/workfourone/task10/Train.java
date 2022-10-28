package ru.mirea.workfourone.task10;

public class Train extends Transport {
    protected double averageSpeed;

    public Train() {
        // constructor
    }

    public Train(double pricePerKilometer, double multiplierPerKilogram, double averageSpeed) {
        super(pricePerKilometer, multiplierPerKilogram);
        this.averageSpeed = averageSpeed;
    }

    public Train(double pricePerKilometer, double averageSpeed) {
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
        return "Train{" + "averageSpeed=" + averageSpeed + ", pricePerKilometer=" + pricePerKilometer + ", multiplierPerKilogram="
                + multiplierPerKilogram + '}';
    }
}
