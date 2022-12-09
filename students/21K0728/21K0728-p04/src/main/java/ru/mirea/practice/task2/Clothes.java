package ru.mirea.practice.task2;

public abstract class Clothes {
    private Size s;
    private int p;
    private String c;

    public Size getSize() {
        return s;
    }

    public void setSize(Size s) {
        this.s = s;
    }

    public int getPrice() {
        return p;
    }

    public void setPrice(int p) {
        this.p = p;
    }

    public String getColor() {
        return c;
    }

    public void setColor(String c) {
        this.c = c;
    }

    public Clothes(Size s, int p, String c) {
        this.s = s;
        this.p = p;
        this.c = c;
    }
}
