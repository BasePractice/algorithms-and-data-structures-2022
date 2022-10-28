package ru.mirea.workfour.task4;

class Proccesor extends Computer {
    private int sumCore;

    public Proccesor(int price, String performance, int valuable) {
        super(price, performance, valuable);
    }

    public int getSumCore() {
        return sumCore;
    }

    public void setSumCore(int sumCore) {
        this.sumCore = sumCore;
    }
}
