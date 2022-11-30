package ru.mirea.practice.work4;

abstract class Main {
    public static void main(String[] args) {
        double[][] c = {{1, 2}, {3, 4}, {5, 6}};
        int n = 3;
        Matrix a = new Matrix(c);
        Matrix b = new Matrix(c);
        System.out.println(a.sum(b).toString());
        System.out.println(a.mulByN(n).toString());
        System.out.println(a);
    }
}
