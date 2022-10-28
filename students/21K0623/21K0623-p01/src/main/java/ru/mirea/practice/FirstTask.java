package ru.mirea.practice;

import java.util.Scanner;

public final class FirstTask {
    private FirstTask() {}

    public static void main(String[] args) {
        // Задание 1.3
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Введите кол-во элементов в массиве: ");
            int temp = sc.nextInt();
            int[] nums = new int[temp];
            double sum = 0;
            System.out.println("Последовательно введите " + temp + " чисел:");
            for (int i = 0; i < nums.length; i++) {
                nums[i] = sc.nextInt();
                sum += nums[i];
            }
            System.out.println("Сумма: " + sum + "\n" + "Средне арифметическое: " + (sum / nums.length));
        }
    }
}
