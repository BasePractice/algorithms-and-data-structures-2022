package ru.mirea.practice.task10;

public class Memory {
    private final int capacity;
    private final String type;

    public Memory(int capacity, String type) {
        this.capacity = capacity;
        this.type = type;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Memory{" + "capacity=" + capacity + ", type='" + type + '\'' + '}';
    }
}
