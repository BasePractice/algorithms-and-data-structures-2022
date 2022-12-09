package ru.mirea.practice.task4;

public class Matrix {
    private int rows;
    private int columns;
    private double[][] array;

    public Matrix(double[][] array) {
        this.rows = array.length;
        this.columns = array[0].length;
        this.array = array;
    }

    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.array = new double[rows][columns];
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public double[][] getArray() {
        return array;
    }

    public Matrix sum(Matrix matrixToAdd) {
        if (matrixToAdd.getRows() != rows && matrixToAdd.getColumns() != columns) {
            return null;
        }
        Matrix sum = new Matrix(rows, columns);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum.getArray()[i][j] = array[i][j] + matrixToAdd.getArray()[i][j];
            }
        }
        return sum;
    }

    public Matrix multiplyBy(double x) {
        Matrix result = new Matrix(array);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result.getArray()[i][j] = this.array[i][j] * x;
            }
        }
        return result;
    }

    @Override
    public String toString() {
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                out.append(array[i][j]).append(" ");
            }
            out.append("\n");

        }
        return out.toString();
    }
}
