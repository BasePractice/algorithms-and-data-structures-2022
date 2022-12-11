package ru.mirea.practice.s21k0627.task2;

import java.util.Scanner;

public class Exception2 {
    public void exceptionDemo() {
        try (Scanner myScanner = new Scanner(System.in)) {
            System.out.print("Enter an integer ");
            try {
                String intString = myScanner.next();
                int i = Integer.parseInt(intString);
                System.out.println(2 / i);
            } catch (NumberFormatException nf) {
                System.out.println("Number format error");
            } catch (ArithmeticException ar) {
                System.out.println("Attempted division by zero");
            }
        }
    }
}
