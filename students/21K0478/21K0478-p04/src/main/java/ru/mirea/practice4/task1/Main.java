package ru.mirea.practice4.task1;

abstract class Main {

    public static void main(String[] args) {
        String season = Seasons.WINTER.toString();
        System.out.println(season + "  ");
        Seasons.WINTER.getdescription();
        EnumTest b = new EnumTest(Seasons.WINTER);
        b.method();
        System.out.println("\n");
        for (Seasons a : Seasons.values()) {
            System.out.println(a.getdescription());
            System.out.println(a.getAirTempereature());
        }
    }
}

