package ru.mirea.practice.task4;

public class Matrix {
    private final double[][] array;
    private final int tablescount;
    private final int linescount;

    public Matrix(double[][] array) {
        this.array = array;
        tablescount = array[0].length;
        linescount = array.length;
    }

    public Matrix(int linesCount, int tablesCount) {
        this.tablescount = tablesCount;
        this.linescount = linesCount;
        this.array = new double[linesCount][tablesCount];
    }

    public void setElement(int line, int table, double value) {
        this.array[line][table] = value;
    }

    public int getTablescount() {
        return tablescount;
    }

    public int getLinesCount() {
        return linescount;
    }

    public Matrix addTo(Matrix otherMatrix) {
        if (otherMatrix.getLinesCount() != linescount && otherMatrix.getTablescount() != tablescount) {
            return null;
        }
        Matrix matrix = new Matrix(linescount, tablescount);
        for (int i = 0; i < this.linescount; i++) {
            for (int j = 0; j < this.tablescount; j++) {
                matrix.getArray()[i][j] += this.array[i][j] + otherMatrix.getByIndex(i, j);
            }
        }
        return matrix;
    }

    public Matrix multiplyBy(double value) {
        Matrix matrix = new Matrix(linescount, tablescount);
        for (int i = 0; i < this.linescount; i++) {
            for (int j = 0; j < this.tablescount; j++) {
                matrix.getArray()[i][j] = this.array[i][j] * value;
            }
        }
        return matrix;
    }

    public double[][] getArray() {
        return this.array;
    }

    public double getByIndex(int line, int table) {
        return this.array[line][table];
    }

    @Override
    public String toString() {
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < linescount; i++) {
            for (int j = 0; j < tablescount; j++) {
                out.append(array[i][j]).append(" ");
            }
            out.append("\n");
        }
        return out.toString();
    }
}
