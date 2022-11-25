package ru.mirea.practice.work1;

public enum Seasons {
    SUMMER(18.96) {
        @Override
        public String getDescription() {
            return "Теплое время года";
        }
    },
    WINTER(-5.47) {
        @Override
        public String getDescription() {
            return "Холодное время года";
        }
    },
    AUTUMN(6.6) {
        @Override
        public String getDescription() {
            return "Холодное время года";
        }
    },
    SPRING(7.23) {
        @Override
        public String getDescription() {
            return "Холодное время года";
        }
    };
    private final double temperature;

    Seasons(double temperature) {
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    public abstract String getDescription();
}
