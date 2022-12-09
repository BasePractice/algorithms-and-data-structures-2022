package mirea.practice.s21k0723;

import java.util.Scanner;

//Вторая задача 1 практической работы
public abstract class Input {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int k = 0;
            do {
                System.out.println("Введите длину масссива:");
                if (scanner.hasNextInt()) {
                    k = scanner.nextInt(); //считывает целое число из поток ввода и сохраняет в переменную
                }
            } while (k < 0);
            int j;
            int count = 0;
            int[] mas = new int[k];
            while (count < mas.length) {
                j = scanner.nextInt();
                mas[count] = j;
                count++;

            }
            int max = -100000;
            int min = 100000;
            int summa = 0;
            for (int y: mas) {
                if (mas[y] < min) {
                    min = mas[y];
                } else {
                    max = mas[y];
                }
                summa += mas[y];
                System.out.print(mas[y]);
                System.out.print(" ");
            }
            System.out.println();
            System.out.print("Сумма элементов массива: ");
            System.out.println(summa);
            System.out.print("Макс элемент массива: ");
            System.out.println(max);
            System.out.print("Мин элемент массива: ");
            System.out.println(min);
        }
    }
}
