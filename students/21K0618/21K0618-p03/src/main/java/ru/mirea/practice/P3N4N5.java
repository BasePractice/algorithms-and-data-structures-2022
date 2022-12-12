package ru.mirea.practice;

import java.util.InputMismatchException;
import java.util.Scanner;

abstract class P3N4N5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            int n = 0;

            while (n <= 0) {
                System.out.println("Введите целое число n, больше 0");
                n = input.nextInt();
            }

            int[] bign = new int[n];
            int d = n;
            n = 0;
            for (int i = 0; i < bign.length; i++) {
                bign[i] = (int) (Math.random() * (d + 1));
                if (bign[i] % 2 == 0) {
                    n += 1;
                }
                System.out.print(bign[i] + " ");
            }

            if (n != 0) {
                System.out.println();
                int[] bigc = new int[n];
                n = 0;
                for (int j : bign) {
                    if (j % 2 == 0) {
                        bigc[n] = j;
                        System.out.print(bigc[n] + " ");
                        n += 1;
                    }
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Error");
            input.nextInt();
        } finally {
            input.close();
        }
    }
}
