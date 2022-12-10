package ru.mirea.practice.task4;

public class Memory {
    private final Marks name;
    private final double frequency;
    private final int size;

    public Memory(Marks name, double frequency, int size) {
        this.name = name;
        this.frequency = frequency;
        this.size = size;
    }
    public String toString() {
        return  "Частота оперативной памяти компьютера " + name + "\t: " + frequency + ". Объём: " + this.size;
    }
}
