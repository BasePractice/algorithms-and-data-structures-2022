package ru.mirea.practice.ex3;

import java.util.Arrays;

public class Tester {
    private Circle[] circles;
    private final int quantity;

    Tester(int quantity) {
        this.quantity = quantity;
        circles = new Circle[this.quantity];
    }

    public void insert(int index, Circle circle) {
        this.circles[index] = circle;
    }

    public Circle circleAt(int index) {
        return  circles[index];
    }

    public int size() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Tester{"
                + "circles=" + Arrays.toString(circles)
                + ", quantity=" + quantity
                + '}';
    }
}
