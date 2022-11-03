package ru.mirea.practice.s21K0688.task10;

import java.util.Scanner;

public class HowManyJava {
    public static void main(String[] args) {
        String a = new String();
        Scanner sc = new Scanner(System.in);

        System.out.println("Line: ");
        a = sc.nextLine();
        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == ' ') {
                count++;
            }
        }
        count++;
        System.out.print(count);
    }
}
