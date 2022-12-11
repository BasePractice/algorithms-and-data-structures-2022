package ru.mirea.practice.s21k0706.z4;

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
        return "Numper of cores \n" + this.numberOfCores + "Takt Frequency \n" + this.taktFrequency + "Heat Dissipation \n" + this.heatDissipation;
    }

}
