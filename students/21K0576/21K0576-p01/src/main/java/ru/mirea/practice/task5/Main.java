package ru.mirea.practice.task5;

abstract class Main {
    public static int fact(int num) {
        int res = 1;
        for (int i = 2; i <= num; ++i) {
            res *= i;
        }
        return res;
    }

    public static void main(String[] args) {
        int testNum = 8;
        System.out.println(fact(testNum));
    }
}