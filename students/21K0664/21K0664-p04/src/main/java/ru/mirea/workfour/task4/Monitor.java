package ru.mirea.workfour.task4;

class Monitor extends Computer {
    private int screen;

    Monitor(int price, String performance, int valuable) {
        super(price, performance, valuable);
    }

    public int getScreen() {
        return screen;
    }

    public void setScreen(int screen) {
        this.screen = screen;
    }

}
