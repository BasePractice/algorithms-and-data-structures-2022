package ru.mirea.practice.s21k0647;

public class Punkt3 {
    public static void main(String[] args) {
        int []array = {3, 12, 1, 7};
        double a = 0;

        for (int i = 0; i < 4; i++) {
            a += array[i];
        }
        System.out.println(a);
        System.out.println(a / 4);
    }
}
