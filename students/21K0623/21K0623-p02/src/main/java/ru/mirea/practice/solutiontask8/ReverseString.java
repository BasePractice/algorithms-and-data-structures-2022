package ru.mirea.practice.solutiontask8;

import java.util.Scanner;

public final class ReverseString {
    private ReverseString() {}

    public static void reverse(String[] words, int count) {
        for (int i = 0; i < (count / 2); i++) {
            String temp = words[i];
            words[i] = words[count - 1 - i];
            words[count - 1 - i] = temp;
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Введите кол-во элементов в массиве");
            int temp = sc.nextInt();
            String[] words = new String[temp];
            for (int i = 0; i < temp; i++) {
                System.out.println("Введите слово");
                words[i] = sc.next();
            }
            System.out.println("До: ");
            for (int i = 0; i < temp; i++) {
                System.out.println(words[i]);
            }
            reverse(words, temp);
            System.out.println("После: ");
            for (int i = 0; i < temp; i++) {
                System.out.println(words[i]);
            }
        }
    }
}
