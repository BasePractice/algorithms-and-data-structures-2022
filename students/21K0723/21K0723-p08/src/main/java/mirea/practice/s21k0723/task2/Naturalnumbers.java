package mirea.practice.s21k0723.task2;

public abstract class Naturalnumbers {
    public static int numbers(int i, int j) {
        if (i < j) {
            if (i == j) {
                System.out.println(j);
                return j;
            }
            System.out.println(i);
            return numbers(i + 1,j);
        } else {
            if (j == i) {
                System.out.println(i);
                return i;
            }
            System.out.println(j);
            return numbers(j + 1,i);
        }
    }
}