package ru.mirea.practice.task2;

import java.util.Scanner;

public final class Demo2 {
    private Demo2() {
    }

    public static void main(String[] args) {
        try (Scanner myScanner = new Scanner(System.in)) {
            System.out.print("Enter an integer ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            try {
                System.out.println(2 / i);
            } catch (ArithmeticException e) {
                System.out.println("Attempted division by zero");
            } catch (NumberFormatException e) {
                System.out.println("The entered number is not an integer");
            }
        }
    }
}
