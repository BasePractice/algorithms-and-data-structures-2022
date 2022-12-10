package ru.mirea.practice.task1;

import java.util.Scanner;
import java.util.StringTokenizer;

public abstract class Tester {
    public static void main(String[] args) {
        System.out.print("Enter string, using ,.;?/ like a separators : ");
        try (Scanner sc = new Scanner(System.in)) {
            StringTokenizer tokenizer = new StringTokenizer(sc.nextLine(), ".,;/? ");
            String[] strings = new String[tokenizer.countTokens()];
            int i = 0;
            while(tokenizer.hasMoreTokens()) {
                strings[i] = tokenizer.nextToken().replace(" ", "");
                System.out.println(strings[i]);
                i++;
            }
        }
    }
}