package ru.mirea.practice4.task1;

public enum Seasons {
    WINTER(-4.32) {
        @Override
        public String getdescription() {
            return "Шумят бураны";
        }
    },
    SUMMER(123) {
        @Override
        public String getdescription() {
            return "Светит солнце";
        }
    },
    AUTUMN(3.5) {
        @Override
        public String getdescription() {
            return "Падают листья";
        }
    },
    SPRING(9.54) {
        @Override
        public String getdescription() {
            return "Цветут цветы";
        }
    };
    private final double airTempereature;

    Seasons(double temperature) {
        this.airTempereature = temperature;
    }

    public double getAirTempereature() {
        return airTempereature;
    }

    public abstract String getdescription();
}