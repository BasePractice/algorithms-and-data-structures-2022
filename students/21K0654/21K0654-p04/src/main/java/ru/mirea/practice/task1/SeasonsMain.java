package ru.mirea.practice.task1;

public class SeasonsMain {
    public static void print(Seasons s) {
        switch (s) {
            case WHINTER:
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
        }
    }

    public static void main(String[] args) {
        Seasons seasons = Seasons.AUTUMN;
        System.out.println(seasons.getDiscription());
        print(seasons);
    }
}
