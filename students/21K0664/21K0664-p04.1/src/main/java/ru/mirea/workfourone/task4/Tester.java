package ru.mirea.workfourone.task4;

abstract class Tester {
    public static void main(String[] args) {
        double[][] c = {{231, 9}, {13, 34}, {231, 21}};

        Matrix a = new Matrix(2,3,c);
        Matrix b = new Matrix(2,3,c);

        System.out.println(a.sum(b));
        System.out.println(a.mul(12));
        System.out.println(a);
    }
}
