package ru.mirea.worksix.task10;

public class Computer {
    private boolean existence;
    protected EnumComputer companyName;
    protected double cost;
    private Processor processor;
    private Memory memory;
    private Monitor monitor;

    Computer() {
        this.existence = true;
    }

    public Computer(EnumComputer companyName, double cost, Processor processor, Memory memory, Monitor monitor) {
        this.companyName = companyName;
        this.cost = cost;
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
        this.existence = true;
    }

    public boolean getExistence() {
        return existence;
    }

    @Override
    public String toString() {
        return "Computer{Company name:" + companyName + ", Cost=" + cost + '}';
    }

}
