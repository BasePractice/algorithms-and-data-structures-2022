package ru.mirea.practice.task0.task4;

import java.util.*;

public abstract class RandMas {
    public static void main(String[] args) {
        int n;
        Random rand = new Random();
        try (Scanner sc = new Scanner(System.in)) {
            if (sc.hasNextInt()) {
                n = sc.nextInt();
                Integer[] arr1 = new Integer[n];
                List arr2 = new ArrayList();
                for (int i = 0; i < arr1.length; i++) {
                    arr1[i] = rand.nextInt(n + 1);
                    if (arr1[i] % 2 == 0) {
                        arr2.add(arr1[i]);
                    }

                }
                System.out.println(Arrays.toString(arr1));
                System.out.println(arr2);

            } else {
                System.out.println("Число некорректно, введите ещё раз!");
            }
            sc.close();
        }
    }
}
