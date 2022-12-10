package ru.mirea.practice.task4;

public abstract class Main {
    public static void main(String[] args) {
        double[][] a1 = {{1, 2}, {3, 4}};
        double[][] a2 = {{3, 4}, {2, 1}};
        Matrix m1 = new Matrix(a1);
        System.out.println(m1);
        Matrix m2 = new Matrix(a2);
        Matrix sum = m1.sum(m2);
        System.out.println(sum);
        System.out.println(m1.multiplyBy(2));

    }
}
