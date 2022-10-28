package ru.mirea.practice.task10;

public class Memory {
    private final int volume;
    private final String type;

    public Memory(int volume, String type) {
        this.volume = volume;
        this.type = type;
    }

    @Override
    public String toString() {
        return "memory {" + "volume=" + volume + ", type=" + type + '}';
    }
}
