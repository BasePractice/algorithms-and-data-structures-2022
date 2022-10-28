package ru.mirea.practice.work15;

import java.util.Random;

import static java.lang.Math.pow;

abstract class Digitsnumbersfromrighttoleft {
    private static void rec(int i, int n) {
        int buff = n;
        buff /= pow(10, i);
        buff %= pow(10, 1);
        if (buff == 0 & i != 1) {
            System.out.println("");
        } else {
            System.out.print(buff);
            System.out.print(" ");
            i++;
            rec(i, n);
        }
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int n = rand.nextInt(1000);
        int i = 0;
        System.out.println(n);
        rec(i, n);
    }
}
