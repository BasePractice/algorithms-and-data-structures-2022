package mirea.practice.s21k0723.task3;

public abstract class Summa {
    public static int sum(int n) {
        if (n < 10) {
            return n;
        }
        return n % 10 + sum(n / 10);
    }
}