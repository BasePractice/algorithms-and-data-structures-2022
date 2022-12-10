package ru.mirea.practice.task1;

import java.util.Scanner;
import java.util.StringTokenizer;

public abstract class Tester {
    public static void main(String[] args) {
        System.out.print("Input string: ");
        try (Scanner scan = new Scanner(System.in)) {
            StringTokenizer token = new StringTokenizer(scan.nextLine(), ";,. ");
            String[] stringArgs = new String[token.countTokens()];
            for (int i = 0; i < stringArgs.length; i++) {
                if (token.hasMoreTokens()) {
                    stringArgs[i] = token.nextToken().replace(" ", "");
                }
                System.out.println(stringArgs[i]);
            }
        }
    }
}
