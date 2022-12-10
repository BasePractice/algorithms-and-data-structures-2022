package ru.mirea.practice.task1;

public abstract class Tester {
    public static void favSeasons(Seasons season) {
        switch (season) {
            case WINTER:
                System.out.println("Я люблю зиму");
                break;

            case SPRING:
                System.out.println("Я люблю весну");
                break;

            case SUMMER:
                System.out.println("Я люблю лето");
                break;

            case AUTUMN:
                System.out.println("Я люблю осень");
                break;

            default:
                System.out.println("Я люблю любое время года");
                break;
        }
    }

    public static void main(String[] args) {
        Seasons fav = Seasons.SUMMER;
        System.out.println(fav);
        favSeasons(fav);
        Seasons[] seasons = Seasons.values();
        for (Seasons season : seasons) {
            System.out.println(season.getInfo());
        }
    }
}
