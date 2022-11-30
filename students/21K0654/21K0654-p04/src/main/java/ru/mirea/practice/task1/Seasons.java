package ru.mirea.practice.task1;

public enum Seasons {
    WHINTER(-15),
    SPRING(14),
    SUMMER(27) {
        @Override
        public String getDiscription() {
            return "Теплое время года, сред. температура:" + String.valueOf(this.getTmp());
        }
    },
    AUTUMN(15);
    private double tmp;
    public  double getTmp(){
        return this.tmp;
    }
    Seasons(double tmp) {
        this.tmp = tmp;
    }

    public String getDiscription() {
        return ("Холодное время года, сред. температура:" + String.valueOf(this.tmp));
    }
}
