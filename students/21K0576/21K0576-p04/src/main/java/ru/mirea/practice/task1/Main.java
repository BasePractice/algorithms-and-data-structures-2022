package ru.mirea.practice.task1;

abstract class Main {
    public static void main(String[] args) {
        Seasons fav = Seasons.WINTER;
        System.out.println(fav);
        method2(fav);
        for (Seasons s : Seasons.values()) {
            System.out.printf("%s %f %s\n\n", s, s.avTemp, s.getDescription());
        }
    }

    static void method2(Seasons s) {
        switch (s) {
            case SPRING:
                System.out.printf("Я люблю весну\n");
                break;
            case SUMMER:
                System.out.printf("Я люблю лето\n");
                break;
            case AUTUMN:
                System.out.printf("Я люблю осень\n");
                break;
            case WINTER:
                System.out.printf("Я люблю зиму\n");
                break;
            default:
                System.out.printf("Я где вообще\n");
                break;
        }
    }

    enum Seasons {
        SPRING(18),
        SUMMER(25) {
            String getDescription() {
                return "Тёплое время года";
            }
        },
        AUTUMN(8),
        WINTER(-15);

        String getDescription() {
            return "Холодное время года";
        }

        Seasons(float temp) {
            avTemp = temp;
        }

        float avTemp;
    }
}
