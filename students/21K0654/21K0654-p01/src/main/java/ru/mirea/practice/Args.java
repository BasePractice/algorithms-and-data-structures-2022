package ru.mirea.practice;

import java.util.Scanner;

public class Args {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = new String[5];
        for (int i = 0;i < s.length;i++) {
            s[i] = sc.nextLine();
        }
        args = s;
        for (String str : args) {
            System.out.println("аргумент = " + str);
        }
    }
}
