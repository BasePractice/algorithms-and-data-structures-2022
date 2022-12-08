package ru.mirea.practice.MathRandom.Ex4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        while (true) {
            while (!sc.hasNextInt()) {
                System.out.println("try again, please");
                sc.next();
            }
            n = sc.nextInt();
            if (n <= 0) {
                System.out.println("try again, please");
            } else {
                break;
            }
        }

        int[] array = new int[n];
        boolean haveEven = false;
        for (int i = 0; i < n; i++) {
            double f = Math.random()/Math.nextDown(1.0);
            array[i] = (int) (0*(1.0 - f) + n*f);
            if (array[i] % 2 == 0) {
                haveEven = true;
            }
            System.out.print(array[i] + " ");
        }
        if (haveEven) {
            System.out.println();
            ArrayList<Integer> evenArray = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if (array[i] % 2 == 0) {
                    evenArray.add(array[i]);
                }
            }
            for (Integer element : evenArray) {
                System.out.print(element + " ");
            }
        }
    }
}
