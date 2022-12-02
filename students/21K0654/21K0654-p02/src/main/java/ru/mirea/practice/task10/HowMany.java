package ru.mirea.practice.task10;

import java.util.Scanner;

public final class HowMany {
    private HowMany() {
    }

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("введите слова одной строкой, разделяя их только пробелом");
        String s = sc.nextLine();
        int count = 0;
        if (s.length() != 0) {
            count++;
            for (int i = 0; i < s.length(); i++) {
                count++;
            }
        }
        System.out.println(count + " слов(а)");
    }
}
