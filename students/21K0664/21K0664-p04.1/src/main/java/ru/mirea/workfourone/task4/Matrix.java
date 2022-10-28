package ru.mirea.workfourone.task4;

import java.util.Arrays;

public class Matrix {
    private double[][] arr;
    private int columns;
    private int lines;

    Matrix() {
    }

    Matrix(int columns, int lines, double[][] arr) {
        this.lines = lines;
        this.columns = columns;
        this.arr = arr;
    }

    Matrix(int columns, int lines) {
        this.lines = lines;
        this.columns = columns;
    }

    Matrix(double[][] arr) {
        this.arr = arr;
        this.lines = arr.length;
        this.columns = arr[0].length;
    }

    public int getColumns() {
        return columns;
    }

    public int getLines() {
        return lines;
    }

    public double[][] getArr() {
        return arr;
    }

    public Matrix sum(Matrix b) {
        double[][] a = new double[this.lines][this.columns];
        for (int i = 0; i < this.lines; i++) {
            for (int j = 0; j < this.columns; j++) {
                a[i][j] = 0;
            }
        }
        Matrix c = new Matrix(this.lines, this.columns, a);
        for (int i = 0; i < this.lines; i++) {
            for (int j = 0; j < this.columns; j++) {
                c.getArr()[i][j] = (this.arr[i][j] + b.getArr()[i][j]);
            }
        }
        return c;
    }

    public Matrix mul(int b) {
        double[][] a = new double[this.lines][this.columns];
        for (int i = 0; i < this.lines; i++) {
            for (int j = 0; j < this.columns; j++) {
                a[i][j] = 0;
            }
        }
        Matrix c = new Matrix(this.lines, this.columns, a);
        for (int i = 0; i < this.lines; i++) {
            for (int j = 0; j < this.columns; j++) {
                c.getArr()[i][j] = this.arr[i][j] * b;
            }
        }
        return c;
    }

    public String toString() {
        System.out.println("Матрица:");
        for (int i = 0; i < this.lines; i++) {
            for (int j = 0; j < this.columns; j++) {
                // FIXME: Что за логика?
                // return Arrays.deepToString(this.arr);
            }
        }
        return "";
    }


}
