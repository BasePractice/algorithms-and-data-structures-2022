package ru.mirea.practice.task2;

import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Tester {
    private final List<Circle> array = new ArrayList<>();

    public Tester() {
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            int x = rand.nextInt(5);
            int y = rand.nextInt(20);
            double r = rand.nextDouble() * 20;
            array.add(i, new Circle(new Point(x, y), r));
        }
    }

    public void min() {
        Circle minCircle = null;
        double minRadius = 10000;
        for (Circle circle : array) {
            if (circle.getRad() < minRadius) {
                minRadius = circle.getRad();
                minCircle = circle;
            }
        }
        System.out.println("Minimal circle: " + minCircle);
    }
    public void max() {
        Circle maxCircle = null;
        double maxRadius = 0;
        for (Circle circle : array) {
            if (circle.getRad() > maxRadius) {
                maxRadius = circle.getRad();
                maxCircle = circle;
            }
        }
        System.out.println("Maximal circle: " + maxCircle);
    }

    public void sort() {
        array.sort(Comparator.comparingDouble(Circle::getRad));
    }

    public void printAllCircles() {
        for (Circle circle : array) {
            System.out.println(circle.toString());
        }
    }
}

