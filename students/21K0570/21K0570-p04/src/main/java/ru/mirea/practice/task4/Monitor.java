package ru.mirea.practice.task4;

public class Monitor {
    private final Marks name;
    private final double size;

    public Monitor(Marks name, double size) {
        this.name = name;
        this.size = size;
    }
    public String toString() {
        return "Диагональ монитора компьютера " + name + "\t: " + this.size;
    }
}
