package ru.mirea.practice.task3;

import java.util.ArrayList;
import java.util.List;

public class Tester {

    private int circlesCount;
    private final List<Circle> circles;

    public Tester() {
        circlesCount = 0;
        circles = new ArrayList<Circle>();
    }

    public void addCircle(Circle circle) {
        circlesCount++;
        circles.add(circle);

    }

    public void printCircles() {
        System.out.println("Only " + circlesCount + " cirles");
        for (int i = 0; i < circles.size(); i++) {
            System.out.println(i + " " + circles.get(i).toString());
        }
    }
}
