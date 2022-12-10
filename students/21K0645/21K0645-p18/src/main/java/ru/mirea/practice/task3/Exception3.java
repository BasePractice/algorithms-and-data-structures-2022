package ru.mirea.practice.task3;

import java.util.Scanner;

public class Exception3 {
    public void exceptionDemo() {

        try (Scanner myScanner = new Scanner(System.in)) {
            System.out.print("Enter an integer ");
            try {
                String intString = myScanner.next();
                int i = Integer.parseInt(intString);
                System.out.println(2 / i);
            } catch (NumberFormatException ne) {
                System.err.println("Number format error");
            } catch (ArithmeticException ae) {
                System.err.println("Attempted division by zero");
            } catch (Exception exception) {
                System.err.println(exception);
            }
        }
    }
}