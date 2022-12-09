package ru.mirea.practice.ex1;

public final class Main {
    private Main() {

    }

    public enum Seasons {
        WINTER(-6),
        SPRING(7),
        SUMMER(18) {
            @Override
            public String getDescription() {
                return "Warm season";
            }
        },
        AUTUMN(6);

        final int averageTemp;
        Seasons(int averageTemp) {
            this.averageTemp = averageTemp;
        }

        public String getDescription() {
            return "Cold season";
        }
    }

    public static void printFaveSeason(Seasons season) {
        switch (season) {
            case WINTER:
                System.out.println("I love Winter");
                break;
            case SPRING:
                System.out.println("I love Spring");
                break;
            case SUMMER:
                System.out.println("I love Summer");
                break;
            case AUTUMN:
                System.out.println("I love Autumn");
                break;
            default:
        }
    }

    public static void main(final String[] args) {
        for (Seasons season : Seasons.values()) {
            System.out.println(season);
            System.out.println("Average temperature: " + season.averageTemp);
            System.out.println(season.getDescription());
            System.out.println();
        }
    }
}
