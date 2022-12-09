package ru.mirea.practice.task4;

public class Matrix {
    private double[][] matrix;
    private int column;
    private int line;

    public Matrix() {
        column = 0;
        line = 0;
        matrix = new double[line][column];
    }

    public Matrix(double[][] matrix) {
        this.matrix = matrix;
        line = matrix.length;
        column = matrix[0].length;
    }

    public Matrix(int lines, int columns) {
        this.column = columns;
        this.line = lines;
        matrix = new double[lines][columns];
    }

    public double[][] getMatrix() {
        return matrix;
    }

    public int getColumn() {
        return column;
    }

    public int getLine() {
        return line;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public void setMatrix(double[][] matrix) {
        this.matrix = matrix;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public void setCell(int lines, int columns, double value) {
        matrix[lines][columns] = value;
    }

    public double getByIndex(int line, int columns) {
        return matrix[line][columns];
    }

    public Matrix addToMatrix(Matrix other) {
        if (getLine() != other.getLine() || getColumn() != other.getColumn()) {
            return null;
        } else {
            Matrix tempMatrix = new Matrix(line, column);
            for (int i = 0; i < line; i++) {
                for (int j = 0; j < column; j++) {
                    tempMatrix.setCell(i, j, this.getByIndex(i, j) + other.getByIndex(i, j));
                }
            }
            return tempMatrix;
        }
    }

    public Matrix multByNumber(double number) {
        Matrix tempMatrix = new Matrix(matrix);
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                tempMatrix.setCell(i, j, tempMatrix.getByIndex(i, j) * number);

            }
        }
        return tempMatrix;

    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                builder.append(matrix[i][j]);
                builder.append(" ");
            }
            builder.append("\n");
        }
        return builder.toString();
    }

}
