package ru.mirea.practice.task4;

public abstract class Tester {

    public static void main(String[] args) {
        Matrix firstMatrix = new Matrix(new double[][]{{1, 2, 3}, {2, 5, 6}});
        Matrix secondMatrix = new Matrix(new double[][]{{2, 6, 9}, {7, 8, 5}});
        System.out.println("First matrix");
        System.out.println(firstMatrix.toString());
        System.out.println("Second matrix");
        System.out.println(secondMatrix.toString());
        System.out.println("Sum");
        System.out.println(firstMatrix.addToMatrix(secondMatrix).toString());
        System.out.println("Multiply by 6");
        System.out.println(firstMatrix.multiplyByNumber(6).toString());
        System.out.println("set cell");
        System.out.println(firstMatrix.getByIndex(1, 1));
        firstMatrix.setCell(1, 1, 10);
        System.out.println(firstMatrix.getByIndex(1, 1));

    }
}
