package ru.mirea.practice.s21k0647.zad4;

public class Matrix {
    int n;
    int m;
    float[][] array = new float[n][m];

    Matrix(int n, int m) {
        this.n = n;
        this.m = m;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                this.array[i][j] = 0;
            }
        }

    }

    Matrix(int n, int m, float[][] array) {
        this.n = n;
        this.m = m;
        this.array = array;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                this.array[i][j] = array[i][j];
            }
        }
    }

    public void sum(Matrix matrix2) {
        if (n == matrix2.n && m == matrix2.m) {
            System.out.println("Sum");
            float[][] arr3 = new float[n][m];
            for (int i = 0; i < n; ++i) {
                for (int j = 0; j < m; ++j) {
                    arr3[i][j] = 0;
                }
            }
            Matrix array3 = new Matrix(n, m, arr3);
            for (int i = 0; i < n; ++i) {
                for (int j = 0; j < m; ++j) {
                    array3.array[i][j] = array[i][j] + matrix2.array[i][j];
                    System.out.print(array3.array[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Error");
        }
    }

    public void multiplicationByNumber(float k) {
        float[][] arr3 = new float[n][m];
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                arr3[i][j] = 0;
            }
        }
        Matrix matrix3 = new Matrix(n, m, arr3);
        System.out.println("Matrix multiplication By Number");
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                matrix3.array[i][j] = array[i][j] * k;
                System.out.print(matrix3.array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void matrixMultiplication(Matrix matrix2) {
        if (matrix2.n != this.m) {
            System.out.println("It is impossible to multiply matrices");
        } else {
            float[][] arr3 = new float[this.n][matrix2.m];
            for (int i = 0; i < n; ++i) {
                for (int j = 0; j < matrix2.m; ++j) {
                    arr3[i][j] = 0;
                }
            }
            Matrix matrix3 = new Matrix(this.n, matrix2.m, arr3);
            for (int i = 0; i < matrix3.n; ++i) {
                for (int j = 0; j < matrix3.m; ++j) {
                    for (int k = 0; k < matrix2.n; ++k) {
                        matrix3.array[i][j] += this.array[i][k] * matrix2.array[k][j];
                    }
                }
            }
            System.out.println("Matrix Multiplication");
            matrix3.print();
        }
    }

    public void print() {
        System.out.println("Size: " + n + " " + m);
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

}
