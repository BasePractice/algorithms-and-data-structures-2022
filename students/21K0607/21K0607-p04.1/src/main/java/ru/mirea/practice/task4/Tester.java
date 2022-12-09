package ru.mirea.practice.task4;

public abstract class Tester {
    public static void main(String[] args) {
        Matrix first = new Matrix(new double[][]{{7, 5, 8}, {9, 4, 1}});
        Matrix second = new Matrix(new double[][]{{2, 4, 8}, {10, 5, 7}});
        System.out.println("Первая матрица");
        System.out.println(first.toString());
        System.out.println("Вторая матрица");
        System.out.println(second.toString());
        System.out.println("Сумма");
        System.out.println(first.addToMatrix(second).toString());
        System.out.println("Умножить на 2");
        System.out.println(first.multByNumber(2).toString());
        System.out.println("Установить значение");
        System.out.println(first.getByIndex(1, 1));
        first.setCell(1, 1, 45);
        System.out.println(first.getByIndex(1, 1));
    }


}
