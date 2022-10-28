package ru.mirea.practice.task8;

import java.util.Scanner;

public abstract class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String[] array = new String[4];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextLine();
        }

        for (int i = 0; i < array.length / 2; i++) {
            String t = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = t;
        }

        for (String s : array) {
            System.out.println(s);
        }

    }
}
