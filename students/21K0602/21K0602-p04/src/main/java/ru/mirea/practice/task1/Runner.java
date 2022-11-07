package ru.mirea.practice.task1;

public class Runner {
    public static void main(String[] args) {
        Seasons season = Seasons.Autumn;

        season.getInfo();

        for (Seasons seasons : Seasons.values()) {
            System.out.println(seasons.getInfo());
        }
    }
}
