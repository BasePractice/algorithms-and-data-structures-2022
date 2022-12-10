package ru.mirea.practice.zad10;

public class Processor {
    int numberOfCores;
    int taktFrequency;
    int heatDissipation;

    Processor(int numberOfCores, int taktFrequency, int heatDissipation) {
        this.heatDissipation = heatDissipation;
        this.taktFrequency = taktFrequency;
        this.numberOfCores = numberOfCores;
    }

    @Override
    public String toString() {
        return "Numper of cores " + numberOfCores + "\nTakt Frequency " + taktFrequency + "\nHeat Dissipation " + heatDissipation;
    }

}
