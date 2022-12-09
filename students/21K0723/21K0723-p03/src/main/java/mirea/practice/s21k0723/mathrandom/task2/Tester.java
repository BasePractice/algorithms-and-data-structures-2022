package mirea.practice.s21k0723.mathrandom.task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public abstract class Tester {
    public static void findMaxCircle(Circle[] mas,int col) {

        ArrayList<Double> list = new ArrayList<Double>();
        for (int j = 0; j < col; j++) {
            list.add(mas[j].getR());
        }
        Collections.sort(list);
        System.out.println("Окружность с r = " + list.get(col - 1) + " - наибольшая");
    }

    public static void findMinCircle(Circle[] circles,int col) {
        ArrayList<Double> list = new ArrayList<Double>();
        for (int j = 0; j < col; j++) {
            list.add(circles[j].getR());
        }
        Collections.sort(list);
        System.out.println("Окружность с r = " + list.get(0) + " - наименьшая");
    }

    public static Circle[] sortL(Circle[] circles,int col) {
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < col - i - 1;j++) {
                if (circles[j].getL() > circles[j + 1].getL()) {
                    Circle k = circles[j];
                    circles[j] = circles[j + 1];
                    circles[j + 1] = k;
                }
            }
        }
        return circles;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int k = 0;
            do {
                System.out.println("Введите кол-во элементов: ");
                if (scanner.hasNextInt()) {
                    k = scanner.nextInt();
                }
            } while (k < 0);
            Circle[] circles = new Circle[k];
            Random rand = new Random();
            for (int i = 0; i < circles.length; i++) {
                float x = 1 + rand.nextInt(12);
                float y = 1 + rand.nextInt(13);
                float r = 1 + rand.nextInt(14);
                double l;
                l = 2 * Math.PI * r;
                System.out.print(x + " " + y + " " + r + " " + l);
                System.out.println();
                circles[i] = new Circle(new Point(x, y), r, l);
            }
            for (Circle i : circles) {
                System.out.println(i);
            }
            findMaxCircle(circles, circles.length);
            findMinCircle(circles, circles.length);
            sortL(circles, circles.length);
            for (Circle i : circles) {
                System.out.println(i);
            }
        }
    }

}
