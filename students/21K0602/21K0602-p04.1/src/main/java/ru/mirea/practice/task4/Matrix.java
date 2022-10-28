package ru.mirea.practice.task4;

public class Matrix {
    private double[][] matrix;
    private int columns;
    private int lines;

    private Matrix() {
        columns = 0;
        lines = 0;
        matrix = new double[lines][columns];
    }

    public Matrix(double[][] matrix) {
        this.matrix = matrix;
        lines = matrix.length;
        columns = matrix[0].length;
    }

    public Matrix(int lines, int columns) {
        this.columns = columns;
        this.lines = lines;
        matrix = new double[lines][columns];
    }

    public double[][] getMatrix() {
        return matrix;
    }

    public void setCell(int lines, int columns, double value) {

        matrix[lines][columns] = value;
    }

    public double getByIndex(int line, int column) {
        return matrix[line][column];
    }

    public int getColumns() {
        return columns;
    }

    public int getLines() {
        return lines;
    }

    public Matrix addToMatrix(Matrix other) {
        if (getLines() != other.getLines() || getColumns() != other.getColumns()) {
            return null;
        } else {
            Matrix tempMatrix = new Matrix(lines, columns);
            for (int i = 0; i < lines; i++) {
                for (int j = 0; j < columns; j++) {
                    tempMatrix.setCell(i, j, this.getByIndex(i, j) + other.getByIndex(i, j));
                }
            }
            return tempMatrix;
        }
    }

    public Matrix multiplyByNumber(double number) {
        Matrix tempMatrix = new Matrix(matrix);
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {
                tempMatrix.setCell(i, j, tempMatrix.getByIndex(i, j) * number);

            }
        }
        return tempMatrix;

    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {
                builder.append(matrix[i][j]);
                builder.append(" ");
            }
            builder.append("\n");
        }
        return builder.toString();
    }
}
