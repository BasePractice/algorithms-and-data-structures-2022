package ru.mirea.practice.task1;

abstract class Main {
    public static void main(String[] args) {
        Seasons fav = Seasons.WINTER;
        System.out.println(fav);
        method2(fav);

    }

    static void method2(Seasons s) {
        switch (s) {
            case SPRING:
                System.out.printf("Я люблю весну");
                break;
            case SUMMER:
                System.out.printf("Я люблю лето");
                break;
            case AUTUMN:
                System.out.printf("Я люблю осень");
                break;
            case WINTER:
                System.out.printf("Я люблю зиму");
                break;
            default:
                System.out.printf("Я где вообще");
                break;
        }
    }
    enum Seasons {
        SPRING,
        SUMMER,
        AUTUMN,
        WINTER;
        private float[] avTemp = { 20, 24, 8, -15 };
    }
}
