package ru.mirea.practice.task1;

abstract class Tester {
    public static void main(String[] args) {
        Season myFavoriteSeason = Season.WINTER;
        Season.favorite(myFavoriteSeason);

        for (Season season : Season.values()) {
            System.out.println(season.toString());
        }
    }

}