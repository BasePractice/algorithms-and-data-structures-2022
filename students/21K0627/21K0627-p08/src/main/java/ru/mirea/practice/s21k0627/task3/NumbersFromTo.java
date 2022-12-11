package ru.mirea.practice.s21k0627.task3;

public abstract class NumbersFromTo {
    public static int printing(int a, int b) {
        if (a < b) {
            if (a == b) {
                System.out.print(b);
                return 0;
            }
            System.out.print(a + ", ");
            return printing(a + 1, b);
        } else {
            if (a == b) {
                System.out.print(b);
                return 0;
            }
            System.out.print(a + ", ");
            return printing(a - 1, b);
        }
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 23;
        NumbersFromTo.printing(a, b);
        System.out.println();
        a = 15;
        b = 1;
        NumbersFromTo.printing(a, b);
    }
}
