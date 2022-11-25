package ru.mirea.practice.work4;

public class Monitor extends Computer {
    int framerate;
    double size;

    public Monitor(EnumComputer companyName, double cost, int framerate, double size) {
        super(companyName, cost);
        this.framerate = framerate;
        this.size = size;
    }

    @Override
    public String toString() {
        return "memory:{Framerate= " + framerate + "Size=" + size + '}';
    }
}
