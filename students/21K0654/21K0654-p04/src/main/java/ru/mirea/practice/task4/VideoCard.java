package ru.mirea.practice.task4;

public class VideoCard {
    private String type;
    private String id = "00000000000";

    public VideoCard(String t,String id) {
        this.type = t;
        this.id = id;
    }

    @Override
    public String toString() {
        return this.type + " " + this.id;
    }
}
