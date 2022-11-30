package ru.mirea.workthree.task2;

import java.util.Random;

public final class Tester {
    private Tester() {
    }

    public static Circle[] arrCircle;
    public static int N;

    public static Circle biggestCircle(Circle[] arr, int n) {
        Circle ans = new Circle(0, 0, 0);
        for (int i = 0; i < n; i++) {
            if (ans.getRadius() < arr[i].getRadius()) {
                ans = arr[i];
            }
        }
        return ans;
    }

    public static Circle smallestCircle(Circle[] arr, int n) {
        Circle ans = new Circle(0, 0, 10000000);
        for (int i = 0; i < n; i++) {
            if (ans.getRadius() > arr[i].getRadius()) {
                ans = arr[i];
            }
        }
        return ans;
    }

    public static void sortCircle(Circle[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int g = 0; g < n - 1; g++) {
                if (arr[i].getRadius() > arr[i + 1].getRadius()) {
                    double temp = arr[i].getRadius();
                    arr[i].setRadius(arr[i + 1].getRadius());
                    arr[i + 1].setRadius(temp);
                }
            }
        }
    }

    public static void main(String[] args) {
        Random rand = new Random();
        Circle a = new Circle(1.3, 2.5, rand.nextDouble());
        N = 3;
        arrCircle = new Circle[N];
        arrCircle[0] = a;
        Circle b = new Circle(0.0, 0.0, rand.nextDouble());
        arrCircle[1] = b;
        Circle c = new Circle(150.5, 12.0, rand.nextDouble());
        arrCircle[2] = c;
        System.out.println(arrCircle[0]);
        System.out.println(arrCircle[1]);
        System.out.println(arrCircle[2]);
        System.out.println("Наибольшая окружность:");
        System.out.println(biggestCircle(arrCircle, N));
        System.out.println("Наименьшая окружность:");
        System.out.println(smallestCircle(arrCircle, N));
        sortCircle(arrCircle, N);
        System.out.println("Отсортированный массив:");
        for (int i = 0; i < N; i++) {
            System.out.println(arrCircle[i]);
        }
    }
}
