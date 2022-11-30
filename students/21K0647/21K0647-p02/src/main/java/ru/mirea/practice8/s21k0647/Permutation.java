package ru.mirea.practice8.s21k0647;

import java.util.Scanner;

public final class Permutation {
    private Permutation() {

    }

    public static void main(String[] args) {
        try (Scanner source = new Scanner(System.in)) {
            String s = source.next();
            char[] chars = s.toCharArray();
            for (int i = 0; i < chars.length / 2; ++i) {
                char m = chars[i];
                chars[i] = chars[chars.length - i - 1];
                chars[chars.length - i - 1] = m;
            }
            for (char x: chars) {
                System.out.print(x);
            }
        }
    }
}
