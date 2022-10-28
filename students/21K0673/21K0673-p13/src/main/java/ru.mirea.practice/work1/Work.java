package ru.mirea.practice.work1;

import java.util.Locale;

public class Work {
    private String string;

    Work(String string) {
        this.string = string;
    }

    public void method() {
        System.out.println(string.charAt(string.length() - 1));

        if (string.endsWith("!!!")) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

        if (string.startsWith("I like")) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

        if (string.contains("Java")) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        System.out.println(string.indexOf("Java"));

        System.out.println(string.replace('a', 'o'));

        System.out.println(string.toUpperCase(Locale.ENGLISH));

        System.out.println(string.toLowerCase(Locale.ENGLISH));

        System.out.println(string.substring(1));
    }
}
