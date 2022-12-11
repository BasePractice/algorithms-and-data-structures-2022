package ru.mirea.practice.task10;

public class Computer {
    private Memory memory;
    private Processor processor;
    private Monitor monitor;
    private final Developer developer;

    public Computer(Memory memory, Processor processor, Monitor monitor, Developer developer) {
        this.memory = memory;
        this.processor = processor;
        this.monitor = monitor;
        this.developer = developer;
    }

    public Computer(Developer developer) {
        this.developer = developer;
    }

    @Override
    public String toString() {
        return developer + " {" + processor + memory + monitor + '}';
    }

    enum Developer {
        ASUS,
        HP,
        HyperPC,
        DELL;
    }
}
