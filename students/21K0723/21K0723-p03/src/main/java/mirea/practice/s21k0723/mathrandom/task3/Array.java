package mirea.practice.s21k0723.mathrandom.task3;

import java.util.Random;

public abstract class Array {
    public static void increase(Integer[] integers) {
        boolean flag = true;
        for (int i = 0; i < integers.length - 1; i++) {
            if (integers[i] >= integers[i + 1]) {
                System.out.println("Последовательность не является строго возрастающей");
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("Последовательность является строго возрастающей");
        }
    }

    public static void main(String[] args) {
        Integer [] integers = new Integer[2];
        Random rand = new Random();
        for (int i = 0; i < (integers.length); i++) {
            integers[i] = 5 + rand.nextInt(90);
        }
        for (int j : integers) {
            System.out.print(j + " ");
        }
        System.out.println();
        increase(integers);
    }
}
