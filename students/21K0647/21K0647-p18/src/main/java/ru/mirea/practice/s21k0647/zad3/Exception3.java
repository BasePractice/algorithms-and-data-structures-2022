package ru.mirea.practice.s21k0647.zad3;

import java.util.Scanner;

public class Exception3 {
    public void exceptionDemo() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter an integer ");
            String intString = sc.next();

            try {
                int i = Integer.parseInt(intString);
                System.out.println(2 / i);
            } catch (Exception e) {
                System.err.println("input error");
            }
        }

    }
}
