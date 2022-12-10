package ru.mirea.practice.mathematics.task2;

abstract class Tester2 {
    private static final int N = 5;

    public static void main(String[] args) {
        Circle[] arr = new Circle[N];
        for (int i = 0; i < N; i++) {
            Circle temp = new Circle();
            arr[i] = temp;
            System.out.print(arr[i].getRadius() + " ");
        }
        increasing(arr);
        System.out.print("\n");
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i].getRadius() + " ");
        }
    }

    public static void increasing(Circle[] arr) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (arr[i].getRadius() < arr[j].getRadius()) {
                    Circle temp2 = new Circle();
                    temp2 = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp2;
                }
            }
        }
    }

    public static void comparison(Circle first, Circle second) {
        if (first.getRadius() > second.getRadius()) {
            System.out.print("First circle > Second circle");
        }
        if (first.getRadius() < second.getRadius()) {
            System.out.print("Second circle > First circle");
        }
    }
}
