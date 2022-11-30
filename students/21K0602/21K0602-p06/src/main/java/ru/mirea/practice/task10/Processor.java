package ru.mirea.practice.task10;

public class Processor {
    private final int clockSpeed;

    public Processor(int clockSpeed) {
        this.clockSpeed = clockSpeed;
    }

    public int getClockSpeed() {
        return clockSpeed;
    }

    @Override
    public String toString() {
        return "Processor{" + "clockSpeed=" + clockSpeed + '}';
    }
}
