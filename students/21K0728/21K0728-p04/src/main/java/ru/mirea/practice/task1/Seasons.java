package ru.mirea.practice.task1;

public enum Seasons {
    WINTER(-30, "Too cold"),
    SPRING(20, "Warmy"),
    SUMMER(40, "Hot") {
        @Override
        public String getDescription() {
            return "Warm season";
        }
    },
    FALL(15, "Windy, rainy");

    private final int t;
    private final String description;


    Seasons(int t, String description) {
        this.t = t;
        this.description = description;
    }

    public String getDescription() {
        return "Cold season";
    }

    @Override
    public String toString() {
        return "Description: " + description + "\nAvg temp: " + t;
    }
}
