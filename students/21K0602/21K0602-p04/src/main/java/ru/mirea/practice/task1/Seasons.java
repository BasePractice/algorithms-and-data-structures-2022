package ru.mirea.practice.task1;

public enum Seasons {
    Winter("Cold season",-17),
    Spring("Warm season", 11),
    Summer("Hot season", 21),
    Autumn("Rainy season", 9);
    private final int averageTemperature;
    private final String information;


    Seasons(String info, int temperature) {
        this.information = info;
        this.averageTemperature = temperature;
    }

    public String getInfo() {
        return name() + "\t" +  information + "\t" + averageTemperature;
    }

    String getDescription() {
        return "";
    }
}
