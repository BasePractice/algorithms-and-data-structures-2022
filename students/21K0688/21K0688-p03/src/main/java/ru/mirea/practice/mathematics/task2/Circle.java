package ru.mirea.practice.mathematics.task2;

import java.util.Random;

public class Circle {
    private int radius;
    Random t = new Random();

    public Circle() {
        radius = t.nextInt(10) + 1;
    }

    public int getRadius() {
        return radius;
    }
}
