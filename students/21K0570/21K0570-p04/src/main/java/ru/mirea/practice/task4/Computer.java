package ru.mirea.practice.task4;

public class Computer {
    private Processor cpu;
    private Memory memory;
    private Monitor monitor;

    public Computer(Processor cpu, Memory memory, Monitor monitor) {
        this.cpu = cpu;
        this.monitor = monitor;
        this.memory = memory;
    }
    public void setCpu(Processor cpu) {
        this.cpu = cpu;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public Processor getCpu() {
        return cpu;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Memory getMemory() {
        return memory;
    }

    @Override
    public String toString() {
        return cpu.toString() + "\n" + memory.toString() + "\n" + monitor.toString();
    }
}
