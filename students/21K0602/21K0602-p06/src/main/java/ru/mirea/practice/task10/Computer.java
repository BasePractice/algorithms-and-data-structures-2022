package ru.mirea.practice.task10;

import java.util.Objects;

public class Computer {

    private Monitor monitor;
    private Processor processor;
    private Memory memory;
    private Company company;

    public enum Company {
        HP,
        Acer,
        Apple,

    }

    public Computer(Company company, Monitor monitor, Processor processor, Memory memory) {
        this.monitor = monitor;
        this.processor = processor;
        this.memory = memory;
        this.company = company;
    }

    public Computer(Company company) {
        this.company = company;
        switch (company) {
            case HP:
                monitor = new Monitor("1920x1080", 1);
                processor = new Processor(2);
                memory = new Memory(1024, "SSD");
                break;
            case Acer:
                monitor = new Monitor("1920x1080", 5);
                processor = new Processor(1);
                memory = new Memory(512, "HDD");
                break;
            case Apple:
                monitor = new Monitor("1920x1080", 2);
                processor = new Processor(5);
                memory = new Memory(2048, "SSD");
                break;
            default:
                break;
        }
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
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

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Computer computer = (Computer) o;
        return company == computer.company;
    }

    @Override
    public int hashCode() {
        return Objects.hash(company);
    }

    @Override
    public String toString() {
        return "Computer " + "monitor=" + monitor + ", processor=" + processor + ", memory=" + memory + ", company="
                + company;
    }
}
