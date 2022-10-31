package ru.mirea.practice.task1;

public enum Seasons {
    Winter(-17),
    Spring(11),
    Summer(21),
    Autumn(9);
    private final int AverageTemperature;

    Seasons(int averageTemperature) {
        AverageTemperature = averageTemperature;
    }

    public double getAverageTemperature() {
        return AverageTemperature;
    }


    public String getInformation() {
        return switch (this) {
            case Winter -> ("I love winter");
            case Spring -> ("I love Spring");
            case Summer -> ("I love Summer");
            case Autumn -> ("I love Autumn");
        };
    }

    public String getDescription() {

        return switch (this) {
            case Winter -> "Cold season";
            case Spring -> "Warm season";
            case Summer -> "Hot Summer";
            case Autumn -> "Rainy Season";
        };

    }
}
