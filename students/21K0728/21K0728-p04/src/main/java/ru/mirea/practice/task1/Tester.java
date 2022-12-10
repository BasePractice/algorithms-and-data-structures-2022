package ru.mirea.practice.task1;

abstract class Tester {
    public static void main(String[] args) {
        Seasons bestSeason = Seasons.SPRING;
        fav(bestSeason);

        for (Seasons season : Seasons.values()) {
            System.out.println(season.name());
            System.out.println(season + "\n");
        }
    }

    static void fav(Seasons favSeason) {
        switch (favSeason) {
            case FALL:
                System.out.println("I love fall");
                break;
            case SUMMER:
                System.out.println("I love summer");
                break;
            case SPRING:
                System.out.println("I love spring");
                break;
            case WINTER:
                System.out.println("I love winter");
                break;
            default:
                break;
        }
    }
}
