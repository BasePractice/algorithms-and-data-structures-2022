package ru.mirea.practice.s21k0709.task1;

import java.util.Arrays;
import java.util.Stack;

public abstract class Inverse {
    public static int[] reverseMas(int[] mas) {
        Stack<Integer> stack = new Stack<>();
        for (int i : mas) {
            stack.push(i);
        }
        int j = 0;
        while (!stack.isEmpty()) {
            mas[j] = stack.pop();
            j++;
        }
        return mas;
    }

    public static void main(String[] args) {
        int[] mas = new int[]{1,2,3,4,5};
        mas = reverseMas(mas);
        System.out.println(Arrays.toString(mas));
    }
}
