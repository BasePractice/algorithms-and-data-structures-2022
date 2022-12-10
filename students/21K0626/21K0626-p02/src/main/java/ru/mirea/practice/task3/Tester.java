package ru.mirea.practice.task3;

import java.util.Scanner;

public abstract class Tester {
    public static void main(String[] args) {
        Circle[] mas = new Circle[3];
        try (Scanner sc = new Scanner(System.in)) {

            for (int i = 0; i < mas.length; i++) {
                float x = sc.nextFloat();
                float y = sc.nextFloat();
                double r = sc.nextDouble();
                mas[i] = new Circle(new Point(x, y), r);
            }
        }
    }


}
