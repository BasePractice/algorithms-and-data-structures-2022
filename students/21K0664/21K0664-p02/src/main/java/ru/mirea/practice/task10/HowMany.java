package ru.mirea.practice.task10;

import java.util.Scanner;

public class HowMany {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String words;
        words = in.nextLine();
        int n = 0;
        for (int i = 0; i < words.length(); i++) {
            char ch = words.charAt(i);
            if (ch == ' ' || ch == ',' || ch == '.') {
                n++;
            }
        }
        System.out.print(n + 1);

    }
}
