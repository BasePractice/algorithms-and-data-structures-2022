package ru.mirea.practice;

import java.util.Scanner;

public final class SecondTask {
    private SecondTask() {}

    public static void main(String[] args) {
        // Задание 1.4
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Введите кол-во элементов в списке: ");
            int temp = sc.nextInt();
            while (temp < 1) {
                System.out.print("Введите кол-во элементов в списке: ");
                temp = sc.nextInt();
            }

            int[] nums =  new int[temp];
            System.out.println("Вводите числа: ");
            temp = 0;
            do {
                nums[temp] = sc.nextInt();
                temp += 1;
            } while (temp < nums.length);
            int max = nums[0];
            int min = nums[0];
            int sum = 0;
            temp = 0;
            while (temp < nums.length) {
                sum += nums[temp];
                if (max < nums[temp]) {
                    max = nums[temp];
                }
                if (min > nums[temp]) {
                    min = nums[temp];
                }
                ++temp;
            }

            System.out.println("Сумма: " + sum + "\n" + "Минимальное: " + (min) + " Максимальное: " + (max));
        }
    }
}
