package ru.mirea.practice.work4;

public class Computer {
    protected EnumComputer companyName;
    protected double cost;
    private Processor processor;
    private Memory memory;
    private Monitor monitor;

    public Computer(EnumComputer companyName, double cost, Processor processor, Memory memory, Monitor monitor) {
        this.companyName = companyName;
        this.cost = cost;
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
    }

    public Computer(EnumComputer companyName, double cost) {
        this.companyName = companyName;
        this.cost = cost;
    }

    public Processor getProcessor() {
        return processor;
    }

    public Memory getMemory() {
        return memory;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    @Override
    public String toString() {
        return "Computer{Company name:" + companyName + ", Cost=" + cost + '}';
    }
}
