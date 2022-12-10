package ru.mirea.practice.s21k0627.task4;

import java.util.Scanner;

public class Exception4 {
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
            } finally {
                System.out.println("Finally");
            }
        }
    }
}
