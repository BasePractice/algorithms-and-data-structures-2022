package ru.mirea.practice.n36;

import java.util.Arrays;

class Tester36 {
    private Circle[] c;
    private int l;

    public Tester36(Circle[] c) {
        this.c = c;
        this.l = c.length;
    }

    public Circle[] getC() {
        return c;
    }

    public void setC(Circle[] c) {
        this.c = c;
    }

    public int getL() {
        return l;
    }

    @Override
    public String toString() {
        return Arrays.toString(c);
    }

}

