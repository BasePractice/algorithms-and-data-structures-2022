package ru.mirea.practice.mathematics.task1;

import java.util.Random;

abstract class Tester1 {
    public static void main(String[] args) {
        double[] firstArr = new double[5];
        double[] secondArr = new double[5];
        Random t = new Random();
        for (int i = 0; i < firstArr.length; i++) {
            firstArr[i] = t.nextDouble(10);
            System.out.printf("%.2f ", firstArr[i]);
        }
        System.out.print("\n");
        for (int j = 0; j < secondArr.length; j++) {
            secondArr[j] = Math.random() * 10;
            System.out.printf("%.2f ", secondArr[j]);
        }
        System.out.print("\n-------------------------\n");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (firstArr[i] < firstArr[j]) {
                    double temp;
                    temp = firstArr[i];
                    firstArr[i] = firstArr[j];
                    firstArr[j] = temp;
                }
                if (secondArr[i] < secondArr[j]) {
                    double temp;
                    temp = secondArr[i];
                    secondArr[i] = secondArr[j];
                    secondArr[j] = temp;
                }
            }
        }
        for (double v : firstArr) {
            System.out.printf("%.2f ", v);
        }
        System.out.print("\n");
        for (double v : secondArr) {
            System.out.printf("%.2f ", v);
        }

    }
}
