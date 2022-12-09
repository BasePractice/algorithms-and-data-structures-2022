package ru.mirea.practice.math_random.ex2;

import java.util.Arrays;
public class Tester {
    private final Circle[] circles;
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

    public int min() {
        int minIndex = 0;
        double minValue = circles[0].getRadius();
        for (int i=1;i<this.quantity;i++) {
            if (circles[i].getRadius() < minValue) {
                minIndex = i;
                minValue = circles[i].getRadius();
            }
        }
        return minIndex;
    }

    public int max() {
        int maxIndex = 0;
        double minValue = circles[0].getRadius();
        for (int i=1;i<this.quantity;i++) {
            if (circles[i].getRadius() > minValue) {
                maxIndex = i;
                minValue = circles[i].getRadius();
            }
        }
        return maxIndex;
    }

    public void sort() {
        boolean changed = true;
        Circle tempCircle;
        while (changed) {
            changed = false;
            for (int i=0;i<quantity-1;i++) {
                if (circles[i].getRadius() > circles[i+1].getRadius()) {
                    tempCircle = circles[i];
                    circles[i] = circles[i+1];
                    circles[i+1] = tempCircle;
                    changed = true;
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Tester{" +
                "circles=" + Arrays.toString(circles) +
                ", quantity=" + quantity +
                '}';
    }
}
