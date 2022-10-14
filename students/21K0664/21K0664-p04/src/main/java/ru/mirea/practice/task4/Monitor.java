package ru.mirea.practice.task4;

class Monitor extends Computer {
    private int screen;

    public Monitor(int price, String performance, int valuable) {
        this.performance = performance;
        this.valuable = valuable;
        this.price = price;
    }

    public int getScreen() {
        return screen;
    }

    public void setScreen(int screen) {
        this.screen = screen;
    }

}
