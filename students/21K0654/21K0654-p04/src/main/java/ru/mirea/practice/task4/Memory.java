package ru.mirea.practice.task4;

public class Memory {
    private String type;
    private String id = "00000000000";

    public Memory(String t, String id) {
        this.type = t;
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

    @Override
    public String toString() {
        return this.type + " " + this.id;
    }
}
