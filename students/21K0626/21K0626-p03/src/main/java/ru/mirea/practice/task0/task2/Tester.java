package ru.mirea.practice.task0.task2;

import java.util.Arrays;
import java.util.Random;

public class Tester {
    int n = 5;
    Circle[] c = new Circle[n];

    public static void main(String[] args) {
        Tester t = new Tester();
        t.addMas();
        t.maxCirc();
        t.minCirc();
        t.sortCirc();

    }

    public void addMas() {
        Random rand = new Random();
        for (int i = 0; i < this.c.length; i++) {
            Point p = new Point(rand.nextDouble() * 10, rand.nextDouble() * 10);
            this.c[i] = new Circle(p, rand.nextDouble() * 100, rand.nextDouble() * 10);
            System.out.println("Окружность: " + (i + 1) + " " + c[i]);
        }
    }

    public void minCirc() {
        Circle minC = new Circle(new Point(3.0, 4.0), 22.0, 2000000000000.0);
        for (int i = 0; i < this.c.length; i++) {
            if (this.c[i].getR() < minC.getR()) {
                minC = c[i];
            }
        }
        System.out.println("Окуржность с минимальным радиусом: " + minC.toString());
    }

    public void maxCirc() {
        Circle maxC = new Circle(new Point(3.0, 4.0), 22.0, 0.0);
        for (int i = 0; i < this.c.length; i++) {
            if (this.c[i].getR() > maxC.getR()) {
                maxC = c[i];
            }
        }
        System.out.println("Окуржность с максимальным радиусом: " + maxC.toString());
    }

    public void sortCirc() {
        for (int i = 0; i < c.length - 1; i++) {
            for (int j = 0; j < c.length - 1; j++) {
                if (c[j].getR() > c[j + 1].getR()) {
                    Circle t = c[j];
                    c[j] = c[j + 1];
                    c[j + 1] = t;
                }
            }
        }
        System.out.println("Отсортированный массив: " + Arrays.toString(c));
    }
}
