package ru.mirea.practice.s21k0647.zad1;

import java.util.InputMismatchException;
import java.util.Scanner;

public final class Tester {
    private Tester() {

    }

    public static void main(String[] args) {
        ConcreteFactory numb1 = new ConcreteFactory();
        try (Scanner sc = new Scanner(System.in)) {
            int real = 0;
            int img = 0;
            try {
                System.out.println("Введите действительную часть числа: ");
                real = sc.nextInt();
                System.out.println("Введите мнимую часть числа: ");
                img = sc.nextInt();
            } catch (InputMismatchException e) {
                System.err.println("Вы ввели не число");
                System.exit(0);
            }
            numb1.createComplex();
            numb1.createComplex(real, img);
        }
    }
}
