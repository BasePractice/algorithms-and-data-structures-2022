package ru.mirea.practice.task3;

import java.util.ArrayList;

public class Tester {

    private int circlesCount;
    private final ArrayList<Circle> circles;

    public Tester() {
        circlesCount = 0;
        circles = new ArrayList<Circle>();
    }

    public void addCircle(Circle circle) {
        circlesCount++;
        circles.add(circle);

    }

    public void printCircles() {
        for (int i = 0; i < circles.size(); i++) {
            System.out.println(i + " " + circles.get(i).toString());
        }
    }
}
