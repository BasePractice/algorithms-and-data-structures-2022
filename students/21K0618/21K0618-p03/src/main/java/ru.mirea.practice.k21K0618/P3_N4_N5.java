package ru.mirea.practice.k21K0618;

import java.util.Scanner;

public class P3_N4_N5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 0;

        while (n <= 0) {
            System.out.println("Введите целое число n, больше 0");
            n = input.nextInt();
        }

        int[] N = new int[n];
        int d = n;
        n = 0;
        for (int i = 0; i < N.length; i++) {
            N[i] = (int) (Math.random() * (d + 1) );
            if (N[i] % 2 == 0) {
                n += 1;
            }
            System.out.print(N[i] + " ");
        }

        if (n != 0) {
            System.out.println();
            int[] C = new int[n];
            n = 0;
            for (int i = 0; i < N.length; i++) {
                if (N[i] % 2 == 0) {
                    C[n] = N[i];
                    System.out.print(C[n] + " ");
                    n += 1;
                }
            }
        }
    }
}
