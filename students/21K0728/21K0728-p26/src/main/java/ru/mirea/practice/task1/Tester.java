package ru.mirea.practice.task1;

import java.util.Stack;

public abstract class Tester {
    public static void reverse(int[] arr) {
        Stack<Integer> stck = new Stack<>();
        for (int k : arr) {
            stck.push(k);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stck.pop();
        }
    }

    public static void print(int[] arr) {
        for (int k : arr) {
            System.out.print(k + " ");
        }
        System.out.print("\n");
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5};
        print(arr);
        reverse(arr);
        print(arr);
    }
}
