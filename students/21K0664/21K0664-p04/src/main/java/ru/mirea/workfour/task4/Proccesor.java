package ru.mirea.workfour.task4;

class Proccesor extends Computer {
    private int sumCore;

    public Proccesor(int price, String performance, int valuable) {
        this.performance = performance;
        this.valuable = valuable;
        this.price = price;
    }

    public int getSumCore() {
        return sumCore;
    }

    public void setSumCore(int sumCore) {
        this.sumCore = sumCore;
    }
}
