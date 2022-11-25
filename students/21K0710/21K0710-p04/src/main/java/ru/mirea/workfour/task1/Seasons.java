package ru.mirea.workfour.task1;

public enum Seasons {
    WINTER(-7.9),
    SPRING(5.7),
    AUTUMN(6.1),
    SUMMER(20);
    private final double temperature;

    Seasons(double temperature) {
        this.temperature = temperature;
    }

    public String getDescription() {
        if (this == SUMMER) {
            return "Теплое время года";
        }
        return "Холодное время года";
    }

    public double getTemperature() {
        return this.temperature;
    }

    public void meLike(Seasons a) {
        switch (a) {
            case AUTUMN:
                System.out.println("Я люблю осень");
                break;
            case WINTER:
                System.out.println("Я люблю зиму");
                break;
            case SPRING:
                System.out.println("Я люблю весну");
                break;
            case SUMMER:
                System.out.println("Я люблю лето");
                break;
            default:
                break;
        }
    }
}
