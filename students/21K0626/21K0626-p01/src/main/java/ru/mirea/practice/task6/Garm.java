package ru.mirea.practice.task6;

import java.util.Arrays;

abstract class Garm {
    public static void main(String[] args) {
        double[] a=new double[10];
        for(int i=1;i<a.length+1;i++){
            a[i-1]=1.0/i;
        }
        System.out.println("Gar: "+ Arrays.toString(a));
    }
}
