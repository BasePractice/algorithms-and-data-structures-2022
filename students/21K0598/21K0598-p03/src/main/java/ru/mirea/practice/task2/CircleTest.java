package ru.mirea.practice.task2;

import java.util.Arrays;
import java.util.Random;

abstract class CircleTest {
    public static void main(String[] args) {
        double x = 0.0;
        double y = 0.0;
        Point circlepoint = new Point(x, y);
        circlepoint.setY(y);
        circlepoint.setX(x);
        Circle[] circlelist = new Circle[10];
        Random rand = new Random();
        for (int i = 0; i < circlelist.length; i++) {
            circlelist[i] = new Circle(circlepoint, rand.nextDouble(100));
        }
        Arrays.sort(circlelist);
        System.out.println("Минимальный радиус = " + circlelist[0]);
        System.out.println("Максимальный радиус = " + circlelist[9]);
    }
}
