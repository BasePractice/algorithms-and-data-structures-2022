package ru.mirea.practice.s21K0688.task8;

public class Tester8 {
    public static void main(String[] args) {
        String[] arr = {"a", "b", "c", "d", "f"};
        String temp;
        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n");
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[n - 1];
            arr[n - 1] = temp;
            n--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
