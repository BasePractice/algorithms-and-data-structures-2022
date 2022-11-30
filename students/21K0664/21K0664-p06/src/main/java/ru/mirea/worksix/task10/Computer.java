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

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public EnumComputer getCompanyName() {
        return companyName;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Memory getMemory() {
        return memory;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setCompanyName(EnumComputer companyName) {
        this.companyName = companyName;
    }

    public void setExistence(boolean existence) {
        this.existence = existence;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }


    public boolean getExistence() {
        return existence;
    }

    @Override
    public String toString() {
        return "Computer{Company name:" + companyName + ", Cost=" + cost + '}';
    }

}
