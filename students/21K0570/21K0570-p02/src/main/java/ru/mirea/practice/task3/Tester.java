package ru.mirea.practice.task3;

import java.util.ArrayList;
import java.util.List;

public class Tester {
    private final List<Circle> circles;
    private int cntCircles;

    public Tester() {
        cntCircles = 0;
        circles = new ArrayList<>();
    }

    public void addCircle(Circle circle) {
        cntCircles++;
        circles.add(circle);
    }

    public void print() {
        System.out.println(cntCircles + " circles");
        System.out.println(circles);
    }
}
