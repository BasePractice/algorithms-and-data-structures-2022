package ru.mirea.practice.s21k0706.z1.p5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public final class Arrayhuman {
    private Arrayhuman() {

    }

    public static void main(String[] args) {

        try (Scanner in = new Scanner(System.in)) {
            int n = -10;
            while (n < 1) {
                n = in.nextInt();
                if (n < 1) {
                    System.out.println("Enter a number > 0");
                }
            }
            int[] array1 = new int[n];
            List<Integer> array2 = new ArrayList<Integer>();
            for (int x : array1) {
                x = (int) Math.round(Math.random() * (n + 1));
                System.out.print(x + " ");
                if (x % 2 == 0) {
                    array2.add(x);
                }
            }
            System.out.println();
            for (int x : array2) {
                System.out.print(x + " ");
            }
        }
    }
}
