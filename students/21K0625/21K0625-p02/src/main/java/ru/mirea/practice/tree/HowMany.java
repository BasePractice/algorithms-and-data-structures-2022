package ru.mirea.practice.tree;

import java.util.Scanner;

public final class HowMany {
    private HowMany() {}

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Введите слова одной строкой через пробел");
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
            System.out.println("Вы ввели " + count + " слов");
        }


    }
}