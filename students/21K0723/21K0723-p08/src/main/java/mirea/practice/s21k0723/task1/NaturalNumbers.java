package mirea.practice.s21k0723.task1;

public abstract class NaturalNumbers {
    public static int numbers(int i, int j) {
        if (i == j) {
            System.out.println(j);
            return i;
        }
        System.out.println(i);
        return numbers(i + 1,j);
    }
}