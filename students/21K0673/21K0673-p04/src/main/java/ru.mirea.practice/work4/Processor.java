package ru.mirea.practice.work4;

public class Processor extends Computer {
    int core;
    int flow;
    double frequency;

    public Processor(EnumComputer companyName, double cost, int core, int flow, double frequency) {
        super(companyName, cost);
        this.core = core;
        this.flow = flow;
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return "Processor:{Amount of cores= " + core + "Amount of flows" + flow + "Frequency" + frequency + '}';
    }
}
