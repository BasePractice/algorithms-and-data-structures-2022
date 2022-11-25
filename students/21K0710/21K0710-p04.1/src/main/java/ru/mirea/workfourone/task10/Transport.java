package ru.mirea.workfourone.task10;

public abstract class Transport {
    protected double pricePerKilometer;
    protected double multiplierPerKilogram;

    public Transport() {
        // constructor
    }

    public Transport(double pricePerKilometer, double multiplierPerKilogram) {
        this.pricePerKilometer = pricePerKilometer;
        this.multiplierPerKilogram = multiplierPerKilogram;
    }

    public Transport(double pricePerKilometer) {
        this.pricePerKilometer = pricePerKilometer;
    }

    public double getPricePerKilometer() {
        return pricePerKilometer;
    }

    public void setPricePerKilometer(double pricePerKilometer) {
        this.pricePerKilometer = pricePerKilometer;
    }

    public double getMultiplierPerKilogram() {
        return multiplierPerKilogram;
    }

    public void setMultiplierPerKilogram(double multiplierPerKilogram) {
        this.multiplierPerKilogram = multiplierPerKilogram;
    }

    abstract double getTime(double distance);

    abstract double getPassengerPrice(double distance);

    abstract double getCargoPrice(double distance, double cargoWeight);

    @Override
    public String toString() {
        return "task10.Transport{" + "pricePerKilometer=" + pricePerKilometer + ", multiplierPerKilogram=" + multiplierPerKilogram + '}';
    }
}
