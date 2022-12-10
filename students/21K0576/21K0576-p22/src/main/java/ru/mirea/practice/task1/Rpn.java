package ru.mirea.practice.task1;


import java.util.Scanner;
import java.util.Stack;

public abstract class Rpn {
    private static Stack<Double> stack;

    public static void calc() {
        stack = new Stack<>();
        try (Scanner in = new Scanner(System.in)) {

            String[] strings = in.nextLine().split("\\s+");
            for (String str : strings) {
                if (str.matches("(\\-?\\d+)")) {
                    stack.push(Double.parseDouble(str));
                } else if (str.matches("[*,\\-,\\/,+]$")) {
                    switch (str) {
                        case "+":
                            stack.push(add());
                            break;
                        case "*":
                            stack.push(multiply());
                            break;
                        case "-":
                            stack.push(subtract());
                            break;
                        case "/":
                            try {
                                stack.push(divide());
                            } catch (IllegalArgumentException e) {
                                stack.push((double)0);
                                System.out.println(e);
                            }
                            break;
                        default:
                            break;
                    }
                }
            }

        }
        System.out.println("Ответ: " + stack.pop());
    }

    private static Double add() {
        double a = 0;
        double b = 0;
        if (!stack.isEmpty()) {
            a = stack.pop();
        }
        if (!stack.isEmpty()) {
            b = stack.pop();
        }
        System.out.println(a + "+" + b);
        return a + b;
    }

    private static Double subtract() {
        double a = 0;
        double b = 0;
        if (!stack.isEmpty()) {
            a = stack.pop();
        }
        if (!stack.isEmpty()) {
            b = stack.pop();
        }
        System.out.println(b + "-" + a);
        return b - a;
    }

    private static Double multiply() {
        double a = 0;
        double b = 0;
        if (!stack.isEmpty()) {
            a = stack.pop();
        }
        if (!stack.isEmpty()) {
            b = stack.pop();
        }
        System.out.println(a + "*" + b);
        return a * b;
    }

    private static Double divide() throws IllegalArgumentException {
        double a = 0;
        double b = 0;
        if (!stack.isEmpty()) {
            a = stack.pop();
        }
        if (!stack.isEmpty()) {
            b = stack.pop();
        }
        System.out.println(b + "/" + a);

        if (a == 0) {
            throw new IllegalArgumentException("Деление на ноль");
        } else {
            return b / a;
        }
    }
}