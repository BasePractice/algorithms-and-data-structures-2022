package ru.mirea.practice.task2;

import java.util.ArrayList;
import java.util.Random;

public class Tester {
    private final ArrayList<Circle> array = new ArrayList<>();

    public Tester() {
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            int x = rand.nextInt(20);
            int y = rand.nextInt(20);
            int r = rand.nextInt(20);
            array.add(i, new Circle(new Point(x, y), r));
        }
    }

    public void findMax() {
        Circle maxCircle = null;
        int maxRadius = 0;
        for (Circle circle : array) {
            if (circle.getRadius() > maxRadius) {
                maxRadius = circle.getRadius();
                maxCircle = circle;
            }
        }
        assert maxCircle != null;
        System.out.println("Max circle: " + maxCircle);
    }

    public void findMin() {
        Circle minCircle = null;
        int minRadius = 1000;
        for (Circle circle : array) {
            if (circle.getRadius() < minRadius) {
                minRadius = circle.getRadius();
                minCircle = circle;
            }
        }
        assert minCircle != null;
        System.out.println("Min circle: " + minCircle);
    }

    public void toSort() {
        array.sort((o1, o2) -> (o1.getRadius() - o2.getRadius()));
    }

    public void allCircles() {
        for (Circle circle : array) {
            System.out.println(circle.toString());
        }
    }
}
