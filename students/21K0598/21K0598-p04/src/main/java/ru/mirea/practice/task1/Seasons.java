package ru.mirea.practice.task1;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public enum Seasons {
    Winter("Cold season", -17, 85, 2.2f),
    Spring("Warm season", 11, 69, 2.1f),
    Summer("Hot season", 21, 71, 1.5f),
    Autumn("Rainy season", 9, 82, 1.9f);
    private final int avTemp;
    private final String info;
    private final int humidity;
    private final float windspeed;

    Seasons(String info, int temp, int humidity, float windspeed) {
        this.info = info;
        this.avTemp = temp;
        this.humidity = humidity;
        this.windspeed = windspeed;
    }

    @Contract(pure = true)
    public @NotNull String getInfo() {
        return name() + "\t" + info + "\tAverage temperature:" + avTemp + "\tAverage humidity: " + humidity
                + "\t Average wind speed:" + windspeed;
    }

    @Contract(pure = true)
    @NotNull String getDescription() {
        return "";
    }
}
