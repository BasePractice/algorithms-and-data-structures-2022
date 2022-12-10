package ru.mirea.practice.work14;

import java.util.Random;

import static java.lang.Math.pow;

abstract class Digitsnumbersfromlefttoright {
    private static void amount(int i, int n) {
        int buff = n;
        buff /= pow(10, i);
        if (buff == 0) {
            norm(i, n);
        } else {
            i++;
            amount(i, n);
        }
    }

    private static void norm(int i, int n) {
        int buff = n;
        buff /= pow(10, i - 1);
        buff %= pow(10, 1);
        if (buff == 0 & i != 1) {
            System.out.println("");
        } else {
            System.out.print(buff);
            System.out.print(" ");
            i--;
            norm(i, n);
        }
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int n = rand.nextInt(10000);
        int i = 1;
        System.out.println(n);
        amount(i, n);
    }
}
