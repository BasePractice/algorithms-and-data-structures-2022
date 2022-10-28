package ru.mirea.practice;

import java.util.Scanner;

public class Program5 {
    public static int fkt(int ch) {
        int fRes = 1;
        for (int i = 1; i <= ch; i++) {
            fRes *= i;
        }
        return fRes;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число, факториал которого хотите вычислить \nx = ");
        int x = sc.nextInt();
        System.out.println("x! = " + fkt(x));
    }
}
