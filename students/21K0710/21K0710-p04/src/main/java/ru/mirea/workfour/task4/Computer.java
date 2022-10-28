package ru.mirea.workfour.task4;

public class Computer {
    private Producers producer;
    private Processor processor;
    private Memory memory;
    private Monitor monitor;

    public Computer(Producers producer, Processor processor, Memory memory, Monitor monitor) {
        this.producer = producer;
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
    }

    public Producers getProducer() {
        return producer;
    }

    public void setProducer(Producers producer) {
        this.producer = producer;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    @Override
    public String toString() {
        return "Computer{" + "producer=" + producer + ", processor=" + processor + ", memory=" + memory + ", monitor=" + monitor + '}';
    }
}
