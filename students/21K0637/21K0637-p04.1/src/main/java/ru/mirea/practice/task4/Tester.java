package ru.mirea.practice.task4;

public abstract class Tester {
    public static void main(String[] args) {
        double[][] twoDimArray1 = {{1, 0, 1, 4}, {6, 1, 2, 0}, {3, 1, 0, 4}};
        double[][] twoDimArray2 = {{1, 2, 3, 1}, {1, 1, 1, 4}, {0, 2, 6, 3}};

        Matrix matrixR = new Matrix(twoDimArray1);
        Matrix matrixL = new Matrix(twoDimArray2);

        Matrix matrixSum = matrixR.addTo(matrixL);
        System.out.print(matrixR);
        System.out.println(matrixSum);
    }
}
