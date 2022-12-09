package ru.mirea.practice.task3;

import java.util.Arrays;

public abstract class TestCircle {
    public static void main(String[] a) {
        Circle[] circles = new Circle[10];
        for (int j = 0; j < circles.length; j++) {
            circles[j] = new Circle(Math.random(), Math.random(), Math.random());
        }
        System.out.println(Arrays.toString(circles));
    }
}
