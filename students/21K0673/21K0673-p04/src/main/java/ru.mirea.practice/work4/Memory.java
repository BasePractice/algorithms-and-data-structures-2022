package ru.mirea.practice.work4;

public class Memory extends Computer {
    double capacity;

    public Memory(EnumComputer companyName, double cost, double capacity) {
        super(companyName, cost);
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "memory:{Capacity= " + capacity + '}';
    }
}
