package ru.mirea.practice;
import java.util.Scanner;

abstract class ClassTwo {
    public static void main(String[] args) {
        int[] arr = new int[5];

        Scanner in = new Scanner(System.in);
        try {
            System.out.print("Enter your array: \n");

            int sum = 0;
            int i = 0;
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;

            while (i < 5) {
                arr[i] = in.nextInt();
                sum += arr[i];
                if (arr[i] > max) {
                    max = arr[i];
                }
                if (arr[i] < min) {
                    min = arr[i];
                }
                i++;
            }
            System.out.print("Summa = " + sum + "\n" + "Max = " + max + "\n" + "Min = " + min);
        }
        finally {
            in.close();
        }
    }
}
