package ru.mirea.workfour.task4;

public class Processor {
    private double frequency;
    private String name;
    private int generation;

    public Processor(double frequency, String name, int generation) {
        this.frequency = frequency;
        this.name = name;
        this.generation = generation;
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGeneration() {
        return generation;
    }

    public void setGeneration(int generation) {
        this.generation = generation;
    }

    @Override
    public String toString() {
        return "Processor{" + "frequency=" + frequency + ", name='" + name + '\'' + ", generation=" + generation + '}';
    }
}
