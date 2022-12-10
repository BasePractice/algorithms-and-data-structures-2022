package ru.mirea.practice.task1;

public abstract class Tester {
    public static void main(String[] args) {
        Season myFav = Season.SPRING;
        favouriteSeason(myFav);

        for (Season seasons : Season.values()) {
            System.out.println(seasons.toString());
        }
    }
    static void favouriteSeason(Season favSeason) {
        switch(favSeason){
            case WINTER:
                System.out.println("I love winter");
                break;
            case SPRING:
                System.out.println("I love spring");
                break;
            case SUMMER:
                System.out.println("I love summer");
                break;
            case AUTUMN:
                System.out.println("I love autumn");
                break;
            default:
                break;
        }
    }
}