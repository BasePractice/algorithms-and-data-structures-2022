package ru.mirea.practice.Work_4;

import java.util.Arrays;

public class Matrix {
    private double[][]arr;
    private int columns;
    private int lines;
    Matrix(){}
    Matrix(int columns, int lines, double[][]arr){
        this.lines=lines;
        this.columns=columns;
        this.arr=arr;
    }
    Matrix(int columns, int lines){
        this.lines=lines;
        this.columns=columns;
    }
    Matrix(double[][]arr){
        this.arr=arr;
        this.lines=arr.length;
        this.columns=arr[0].length;
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
    public Matrix sum(Matrix B){
        double[][]a=new double[this.lines][this.columns];
        for (int i=0;i<this.lines;i++){
            for(int j=0;j<this.columns;j++){
                a[i][j]=0;
            }
        }
        Matrix C=new Matrix(this.lines,this.columns,a);
        for (int i=0;i<this.lines;i++){
            for(int j=0;j<this.columns;j++){
                C.getArr()[i][j]=(this.arr[i][j]+B.getArr()[i][j]);
            }
        }
        return C;
    }
    public Matrix mul_by_n(int b){
        double[][]a=new double[this.lines][this.columns];
        for (int i=0;i<this.lines;i++){
            for(int j=0;j<this.columns;j++){
                a[i][j]=0;
            }
        }
        Matrix C=new Matrix(this.lines,this.columns,a);
        for (int i=0;i<this.lines;i++){
            for(int j=0;j<this.columns;j++){
                C.getArr()[i][j]=this.arr[i][j]*b;
            }
        }
        return C;
    }

    public String toString() {
        System.out.println("Матрица:");
        for (int i=0;i<this.lines;i++){
            for(int j=0;j<this.columns;j++){
                return Arrays.deepToString(this.arr);
            }
        }
        return "";
    }
    public static void main(String[] args) {
        double[][]a={{1,2},{3,4},{5,6}};
        int N=3;
        Matrix A=new Matrix(a);
        Matrix B=new Matrix(a);
        System.out.println(A.sum(B).toString());
        System.out.println(A.mul_by_n(N).toString());
        System.out.println(A.toString());
    }
}
