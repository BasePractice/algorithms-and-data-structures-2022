package ru.mirea.workfour.task4;

public class Memory {
    private int frequency;
    private String name;

    public Memory(int frequency, String name) {
        this.frequency = frequency;
        this.name = name;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Memory{" + "frequency=" + frequency + ", name='" + name + '\'' + '}';
    }
}
