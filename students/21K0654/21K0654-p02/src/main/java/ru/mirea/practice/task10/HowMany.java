package ru.mirea.practice.task10;

import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        System.out.println("введите слова одной строкой, разделяя их только пробелом");
        String s = sc.nextLine();
        int count = 0;
        if (s.length() != 0) {
            count++;
            for (int i = 0;i < s.length();i++) {
                if (s.charAt(i) == ' ' && s.charAt(i - 1) != ' ' && s.charAt(i + 1) != ' ') {
                    count++;
                }
            }
        }
        System.out.println(count + " слов(а)");
    }
}
