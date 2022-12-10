package ru.mirea.practice.s21k0647.zad4;

import java.util.Scanner;

public class Exception4 {
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
            } finally {
                System.out.println("Вы что-то ввели");
            }
        }

    }
}
