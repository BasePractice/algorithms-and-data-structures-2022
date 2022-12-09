package ru.mirea.practice;

abstract class One {
    public static void main(String[] args) {
        int[] arr = {4, 6, 7, 9, 1};
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            sum += arr[i];
        }

        System.out.print("Summa = " + sum + "\n" + "Average = " + sum/5);
    }
}
