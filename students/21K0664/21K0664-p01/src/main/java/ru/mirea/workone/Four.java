package ru.mirea.workone;

import java.util.Scanner;

abstract class Four {
    public static int fact(int n) {
        int result = 1;
        for (int i = n; i > 1; i--) {
            result = result * i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("\nЗадание 1.7");
            System.out.println("Введите число: ");
            int pr = input.nextInt();
            input.close();
            System.out.println("\nФакториал числа: ");
            System.out.println(fact(pr));
        } catch (IncompatibleClassChangeError e) {
            System.out.println("Error");
            input.next();
        } finally {
            input.close();
        }
    }
}
