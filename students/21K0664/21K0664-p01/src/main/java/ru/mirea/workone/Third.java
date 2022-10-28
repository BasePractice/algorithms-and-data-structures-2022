package ru.mirea.workone;

import java.util.Scanner;

abstract class Third {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Задание 1.5");
            System.out.print("Введите число: ");
            int num = input.nextInt();
            System.out.printf("Ваше число: %d \n", num);
            System.out.println("\nЗадание 1.6");
            for (int k = 2; k < 10; k++) {
                System.out.println("1/" + k);
            }
        } catch (IncompatibleClassChangeError e) {
            System.out.println("Error");
            input.next();
        } finally {
            input.close();
        }

    }
}
