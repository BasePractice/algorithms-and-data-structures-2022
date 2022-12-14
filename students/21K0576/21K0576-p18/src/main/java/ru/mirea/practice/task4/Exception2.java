package ru.mirea.practice.task4;

import java.util.Scanner;

public class Exception2 {
    public void exceptionDemo() {
        try (Scanner myScanner = new Scanner(System.in)) {
            System.out.print("Введите целое число ");
            String intString = myScanner.next();
            try {
                int i = Integer.parseInt(intString);
                System.out.println(2 / i);
            } catch (Exception e) {
                System.out.println("Caught an exception");
            } finally {
                System.out.println("Этот кусок выполнится в любом случае");
            }
        }
    }
}