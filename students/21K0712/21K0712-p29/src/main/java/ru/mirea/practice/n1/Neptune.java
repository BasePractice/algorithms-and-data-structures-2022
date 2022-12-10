package ru.mirea.practice.n1;

import java.util.Random;

abstract class Neptune {
    public static void main(String[] args) {
        Random random = new Random();
        int counter = random.nextInt(99);
        int[][] g = new int[counter][counter];
        for (int i = 0; i < counter; i++) {
            for (int j = 0; j < counter; j++) {
                if (i == j) {
                    g[i][j] = 0;
                } else {
                    if (Math.random() >= 0.5) {
                        g[i][j] = 1;
                        g[j][i] = 1;
                    } else {
                        g[i][j] = 0;
                        g[j][i] = 0;
                    }
                }
            }
        }
        for (int i = 0; i < counter; i++) {
            for (int j = 0; j < counter; j++) {
                System.out.print(g[i][j] + " ");
            }
            System.out.print("\n");
        }
        int amount = 0;
        int a = 0;
        for (int i = 0; i < counter; i++) {
            for (int j = a; j < counter; j++) {
                if (g[i][j] == 1) {
                    amount++;
                }
            }
            a++;
        }
        System.out.print(amount);
    }
}
