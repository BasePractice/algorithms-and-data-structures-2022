package ru.mirea.practice.task1;

public enum Seasons {
    WINTER(-10, "идет снег"),
    SPRING(12, "всё зеленеет"),
    SUMMER(20, "тепло") {
        @Override
        public String getDescription() {
            return "Теплое время года";
        }
    },
    AUTUMN(8, "дождливо");

    private final int temp;
    private final String description;


    Seasons(int temp, String description) {
        this.temp = temp;
        this.description = description;
    }

    public String getDescription() {
        return "Холодное время года";
    }

    @Override
    public String toString() {
        return "Описание: " + description + "\nAvg temp: " + temp;
    }
}
