package ru.mirea.practice.subchapter.task4;

import java.util.Scanner;

public class Matrix {
    static Scanner sc = new Scanner(System.in);
    private int height;
    private int width;
    private double[][] mat;

    Matrix(int height, int width) {
        this.height = height;
        this.width = width;
        this.mat = new double[height][width];
        System.out.println("Enter matrix: ");
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                mat[j][i] = sc.nextDouble();
            }
        }
    }

    public double[][] getMat() {
        return mat;
    }

    public double[][] plus(Matrix m1, Matrix m2) {
        Matrix res = new Matrix(m1.height, m1.width);
        while (true) {
            if (m1.height == m2.height && m1.width == m2.width) {
                res = new Matrix(m1.height, m1.width);
                for (int i = 0; i < height; i++) {
                    for (int j = 0; j < width; j++) {
                        res.getMat()[i][j] = m1.getMat()[i][j] + m2.getMat()[i][j];
                    }
                }
                return res.getMat();
            } else {
                System.out.println("Размерности матриц не равны");
                sc = new Scanner(System.in);
            }
        }
    }

    public double[][] multNum(Matrix m, double num) {

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                m.getMat()[i][j] = m.getMat()[i][j] * num;
            }
        }
        return m.getMat();
    }

    public void printMatrix(Matrix m) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(m.getMat()[i][j] + " ");
            }
            System.out.println('\n');
        }
    }

    public double[][] multMat(Matrix m1, Matrix m2) {
        Matrix res = new Matrix(m1.height, m1.width);
        while (true) {
            if ((m1.height == m1.width) == (m2.height == m2.width)) {
                res = new Matrix(m1.height, m1.width);
                for (int i = 0; i < height; i++) {
                    for (int j = 0; j < width; j++) {
                        for (int c = 0; c < height; c++) {
                            res.getMat()[i][j] += m1.getMat()[i][c] * m2.getMat()[c][j];
                        }
                    }
                }
                return res.getMat();
            } else {
                System.out.println("Матрицы не квадратны");
                sc = new Scanner(System.in);
            }
        }
    }

}
