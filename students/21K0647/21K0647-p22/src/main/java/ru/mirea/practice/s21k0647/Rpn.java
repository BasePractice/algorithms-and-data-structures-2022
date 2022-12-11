package ru.mirea.practice.s21k0647;

public class Rpn {
    double []arr;
    int top = 0;

    Rpn() {
        // pust
    }

    public void push(double x) {
        arr[top] = x;
        top++;
    }

    public double pop() {
        top--;
        return arr[top];
    }

    public String printer(double x) {
        return "Результат вычисления: " + x;
    }

    public void tester(String str) {
        int nums = 0;
        int signs = 0;
        for (int i = 0; i < str.length(); i++) {
            char h = str.charAt(i);
            if (h >= '0' && h <= '9') {
                nums++;
            }
            if (h == '+' || h == '-' || h == '*' || h == '/') {
                signs++;
            }
        }
        if (nums != signs + 1) {
            System.out.println("Ошибка ввода");
            System.exit(0);
        }
    }

    public void calculate(String str) {
        System.out.println("Вы ввели: " + str);
        tester(str);
        arr = new double[str.length()];
        double rez = 0;
        for (int i = 0; i < str.length(); i++) {
            char h = str.charAt(i);
            if (h == ' ') {
                continue;
            }
            if (h >= '0' && h <= '9') {
                push(Character.digit(h, 10));
            } else if (h == '+' || h == '-' || h == '*' || h == '/') {
                double a;
                double b;
                a = pop();
                b = pop();
                switch (h) {
                    case '*':
                        rez = a * b;
                        break;
                    case '/':
                        if (a == 0) {
                            System.out.println("Случилось деление на 0");
                            System.exit(0);
                        }
                        rez = b / a;
                        break;
                    case '-':
                        rez = b - a;
                        break;
                    case '+':
                        rez = a + b;
                        break;
                    default :
                        break;
                }
                push(rez);
            } else {
                System.out.println("Ошибка ввода");
                System.exit(0);
            }
        }
        System.out.println(printer(rez));
    }
}

