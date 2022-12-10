package ru.mirea.practice.task2;

import java.util.Scanner;

public class Exception2 {
    public void exceptionDemo() {

        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter an integer ");
            try {
                String intString = scan.next();
                int i = Integer.parseInt(intString);
                System.out.println(2 / i);
            } catch (NumberFormatException nexc) {
                System.err.println("Number format error");
            } catch (ArithmeticException aexc) {
                System.err.println("Attempted division by zero");
            }

        }
    }
}