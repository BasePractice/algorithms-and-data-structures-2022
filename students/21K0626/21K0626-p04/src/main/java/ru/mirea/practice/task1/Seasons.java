package ru.mirea.practice.task1;

public enum Seasons {
    SUMMER(25.0) {
        @Override
        public String getDescription() {
            return "Теплое время года";
        }
    },
    AUTUMN(10.0) {
        @Override
        public String getDescription() {
            return "Дождливое время года";
        }
    },
    WINTER(-15.0) {
        @Override
        public String getDescription() {
            return "Холодное время года";
        }
    },
    SPRING(15.0) {
        @Override
        public String getDescription() {
            return "Тёплое время года";
        }
    };
    private final double temp;

    Seasons(double temp) {
        this.temp = temp;
    }

    public String getInfo() {
        return name() + ": " + this.getDescription() + " " + temp;
    }

    public abstract String getDescription();
}
