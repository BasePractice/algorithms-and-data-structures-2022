package ru.mirea.practice.task1;

public enum Season {
    WINTER ("Snow", -10),
    SPRING ("Warm", 10),
    SUMMER("Sun", 25){
        @Override
        public String getDescription() { return "hot season"; }
    },
    AUTUMN("Rain", 5);

    private final int temperature;
    Season(String info, int temperature) {
        this.temperature = temperature;
    }
    public String getDescription() {
        return "cold season";
    }

    @Override
    public String toString() {
        return "Description:\n" + name() + " is " + getDescription() + "; Average temperature is " + temperature;
    }
}
