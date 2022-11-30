package ru.mirea.practice.work5;

import java.util.Random;

import static java.lang.Math.pow;

abstract class Thesumofthedigitsofthenumber {
    private static void sum(int i, int n, int sum) {
        int buff = n;
        buff /= pow(10, i);
        buff %= pow(10, 1);
        sum += buff;
        if (buff == 0 & i != 1) {
            System.out.print(sum);
        } else {
            i++;
            sum(i, n, sum);
        }
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int n = rand.nextInt(10000);
        int i = 0;
        int sum = 0;
        System.out.println(n);
        sum(i, n, sum);
    }
}
