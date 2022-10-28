package ru.mirea.workfourone.task4;

import java.util.Arrays;

public class Matrix {
    private int[][] array;
    private int lanes;
    private int columns;

    public Matrix(int[][] array, int lanes, int columns) {
        this.array = array;
        this.lanes = lanes;
        this.columns = columns;
    }

    public int[][] getArray() {
        return array;
    }

    public void setArray(int[][] array) {
        this.array = array;
    }

    public int getLanes() {
        return lanes;
    }

    public void setLanes(int lanes) {
        this.lanes = lanes;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    public Matrix sum(Matrix b) {
        Matrix c;
        int[][] arrc = new int[this.lanes][this.columns];
        int[][] arrb = b.getArray();
        for (int i = 0; i < this.lanes; i++) {
            for (int g = 0; g < this.columns; g++) {
                arrc[i][g] = this.array[i][g] + arrb[i][g];
            }
        }
        c = new Matrix(arrc, this.lanes, this.columns);
        return c;
    }

    public Matrix mul(int b) {
        Matrix c;
        int[][] arrc = new int[this.lanes][this.columns];
        for (int i = 0; i < this.lanes; i++) {
            for (int g = 0; g < this.columns; g++) {
                arrc[i][g] = this.array[i][g] * b;
            }
        }
        c = new Matrix(arrc, this.lanes, this.columns);
        return c;
    }

    @Override
    public String toString() {
        return "Matrix{" + "array=" + Arrays.toString(array) + ", lanes=" + lanes + ", columns=" + columns + '}';
    }
}
