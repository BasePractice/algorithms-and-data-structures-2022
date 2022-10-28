package ru.mirea.practice.s21k0647.zad4;

public final class Tester {
    private Tester() {

    }

    public static void main(String[] args) {
        float[][] arr1 = {{-2, 1},{5, 4}};
        Matrix matrix1 = new Matrix(2, 2, arr1);
        float[][] arr2 = {{3}, {-1}};
        Matrix matrix2 = new Matrix(2, 1, arr2);
        matrix1.print();
        matrix2.print();
        matrix1.sum(matrix2);
        matrix1.multiplicationByNumber(10);
        matrix1.matrixMultiplication(matrix2);

    }
}
