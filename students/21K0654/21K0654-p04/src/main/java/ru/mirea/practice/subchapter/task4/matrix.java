package ru.mirea.practice.subchapter.task4;

import java.util.Scanner;

public class matrix {
    static Scanner sc=new Scanner(System.in);
    private int a;
    private int b;
    private double[][] mat;
    matrix(int a,int b){
        this.a=a;
        this.b=b;
        this.mat=new double[a][b];
        System.out.println("Enter matrix: ");
        for(int i=0;i<b;i++){
            for(int j=0;j<a;j++){
              mat[j][i]= sc.nextDouble();
            }
        }
    }

    public double[][] getMat() {
        return mat;
    }

    public int plus(matrix m1, matrix m2){
        if(m1.a==m2.a&&m1.b==m2.b){
            matrix res= new matrix(m1.a,m1.b);
            for(int i=0;i<a;i++){
                for(int j=0;j<b;j++){
                    res.getMat()[i][j]= m1.getMat()[i][j]+m2.getMat()[i][j];
                }
            }
        }
        else System.out.println("you are dolboeb");
        return  0;
    }
}
