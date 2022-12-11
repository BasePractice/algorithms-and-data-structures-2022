package ru.mirea.practice.task1;

import java.util.Scanner;
import java.util.StringTokenizer;

public abstract class Manipulations {
    public static void main(String[] args) {
        System.out.println("String:");
        try (Scanner sc = new Scanner(System.in)) {
            StringTokenizer token = new StringTokenizer(sc.nextLine(), "|;,./ ");
            String[] str = new String[token.countTokens()];
            int i = 0;
            while (i < str.length) {
                if (token.hasMoreTokens()) {
                    str[i] = token.nextToken().replace(" ", "");
                }
                System.out.println(str[i]);
                i++;
            }
        }
    }
}
