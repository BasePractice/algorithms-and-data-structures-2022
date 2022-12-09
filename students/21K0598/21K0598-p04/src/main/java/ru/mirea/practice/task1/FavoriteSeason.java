package ru.mirea.practice.task1;

abstract class FavoriteSeason {
    public static void main(String[] args) {
        Seasons season = Seasons.Summer;
        System.out.println(season.getInfo());

        for (Seasons seasons : Seasons.values()) {
            System.out.println(seasons.getInfo());
        }
    }
}
