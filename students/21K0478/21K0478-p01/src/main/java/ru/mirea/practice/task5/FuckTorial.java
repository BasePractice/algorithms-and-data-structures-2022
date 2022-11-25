package ru.mirea.practice.task5;

abstract class FuckTorial {
    public static int fuk(int number) {
        int result = 1;
        for (int i = 1; i < number; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(fuk(10));

    }
}
