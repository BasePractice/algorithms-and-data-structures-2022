package ru.mirea.practice.s21k0647.zad2;

import java.util.Scanner;

public class Exception2 {
    public void exceptionDemo() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter an integer ");
            String intString = sc.next();

            try {
                int i = Integer.parseInt(intString);
                System.out.println(2 / i);
            } catch (NumberFormatException e) {
                System.err.println("i is not an int type");
            } catch (ArithmeticException e) {
                System.err.println("Attempted division by zero");
            }
        }

    }
}
