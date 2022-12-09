package ru.mirea.practice.s21k0647;

import java.util.Locale;
import java.util.Scanner;

public final class Zad1 {
    private Zad1() {

    }

    public static String input(Scanner sc) {
        return sc.nextLine();
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String s = input(sc);
            System.out.println(s);
            System.out.println(s.charAt(s.length() - 1));
            System.out.println(s.endsWith("!!!"));
            System.out.println(s.startsWith("I like"));
            System.out.println(s.contains("Java"));
            String[] ss = s.split("");
            for (int i = 0; i < ss.length; i++) {
                if ("Java".equals(ss[i])) {
                    System.out.println(i);
                }
            }
            System.out.println(s.replace("a", "o"));
            System.out.println(s.toUpperCase(Locale.getDefault()));
            System.out.println(s.toLowerCase(Locale.getDefault()));
            System.out.println(s.substring(1));

        }
    }
}
