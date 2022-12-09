package ru.mirea.practice.task2;


import java.util.Random;

abstract class CircleTest {
    public static void main(String[] args) {
        double x = 0.0;
        double y = 0.0;
        final Point circlepoint = new Point(x, y);
        circlepoint.setY(y);
        circlepoint.setX(x);
        Circle[] circlelist = new Circle[10];
        Random rand = new Random();
        for (int i = 0; i < circlelist.length; i++) {
            circlelist[i] = new Circle(circlepoint, rand.nextDouble());
        }
        for (int i = 9; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                if (circlelist[j].getRad() > circlelist[j + 1].getRad()) {
                    double rad = circlelist[j].getRad();
                    circlelist[j].setRad(circlelist[j + 1].getRad());
                    circlelist[j + 1].setRad(rad);
                }
            }
        }
        System.out.println("Минимальный радиус = " + circlelist[0].getRad());
        System.out.println("Максимальный радиус = " + circlelist[9].getRad());
    }
}
