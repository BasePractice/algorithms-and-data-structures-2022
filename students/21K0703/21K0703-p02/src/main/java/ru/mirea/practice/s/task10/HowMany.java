package ru.mirea.practice.s.task10;

import java.util.Scanner;

public abstract class HowMany {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String input = sc.nextLine();
        int count = 0;

        if (input.length() != 0) {
            count++;
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == ' ') {
                    count++;
                }
            }
        }

        System.out.printf("Введено слов: %d", count);
    }
}
