package ru.mirea.practice.task1;

public class Runner {
    public static void main(String[] args) {
        Seasons season = Seasons.Autumn;

        season.getInformation();
        System.out.println(season + " " + season.getInformation() + " Average temperature " + season.getAverageTemperature() + " "
                + season.getDescription());

        for (Seasons seasons : Seasons.values()) {
            System.out.println(seasons + " " + seasons.getInformation() + " Average temperature " + seasons.getAverageTemperature() + " "
                    + seasons.getDescription());
        }
    }
}
