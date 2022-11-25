package ru.mirea.workone;

import java.util.Scanner;


abstract class First {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Первая практическая работа");
            System.out.println("Задание 1.3");
            System.out.print("Введите длину массива:");
            int n = input.nextInt();
            int sum = 0;
            int[] array = new int[n];
            for (int i = 0; i < array.length; i++) {
                array[i] = (int) (Math.random() * n);
                System.out.println(array[i]);
                sum += array[i];
            }
            double mid = ((double) sum) / n;
            System.out.println("Сумма чисел: " + sum);
            System.out.println("Среднее арифмитическое: " + mid + "\n");



        } catch (IncompatibleClassChangeError e) {
            System.out.println("Error");
            input.next();
        } finally {
            input.close();
        }
    }
}
