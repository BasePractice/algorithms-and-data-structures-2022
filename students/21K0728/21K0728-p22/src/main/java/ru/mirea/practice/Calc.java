package ru.mirea.practice;

import java.util.Scanner;
import java.util.Stack;

public abstract class Calc {
    private static Stack<Double> stack;

    public static void main(String[] args) {
        calculate();
    }

    public static void calculate() {
        stack = new Stack<>();
        try (Scanner scan = new Scanner(System.in)) {
            String[] strings = scan.nextLine().split("\\s+");
            for (String strng : strings) {
                if (strng.matches("-?\\d+")) {
                    stack.push(Double.parseDouble(strng));
                } else if (strng.matches("[*,\\-,\\/,+]")) {
                    switch (strng) {
                        case "+":
                            stack.push(sum());
                            break;
                        case "-":
                            stack.push(subtraction());
                            break;
                        case "*":
                            stack.push(multiply());
                            break;
                        case "/":
                            try {
                                stack.push(divide());
                            } catch (IllegalArgumentException exc) {
                                stack.push(0.0);
                                System.out.print("\n" + exc);
                            }
                            break;
                        default:
                            break;
                    }
                }
            }
            System.out.print("= " + stack.pop());
        }
    }

    public static Double sum() {
        double x = 0;
        double y = 0;
        if (!stack.isEmpty()) {
            y = stack.pop();
        }
        if (!stack.isEmpty()) {
            x = stack.pop();
        }
        System.out.print(" " + x + " + " + y + " ");
        return x + y;
    }

    public static Double subtraction() {
        double x = 0;
        double y = 0;
        if (!stack.isEmpty()) {
            y = stack.pop();
        }
        if (!stack.isEmpty()) {
            x = stack.pop();
        }
        System.out.print(" " + x + " - " + y + " ");
        return x - y;
    }

    public static Double multiply() {
        double x = 0;
        double y = 0;
        if (!stack.isEmpty()) {
            y = stack.pop();
        }
        if (!stack.isEmpty()) {
            x = stack.pop();
        }
        System.out.print(" " + x + " * " + y + " ");
        return x * y;
    }

    public static Double divide() {
        double x = 0;
        double y = 0;
        if (!stack.isEmpty()) {
            y = stack.pop();
        }
        if (!stack.isEmpty()) {
            x = stack.pop();
        }
        System.out.print(" " + x + " / " + y + " ");
        if (y == 0) {
            throw new IllegalArgumentException("Attempted division by zero");
        } else {
            return x / y;
        }
    }
}
