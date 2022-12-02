package ru.mirea.practice.k21K0618;

import java.util.Random;

public class P3_N1 {
    public static void main(String[] args) {
        double[] mm = new double[10];
        for (int i = 0; i < mm.length; i++)
        {
            mm[i] = Math.random();
            System.out.print(mm[i] + " ");
        }
        System.out.println();
        for (int i = 1; i < mm.length; i++) {
            double current = mm[i];
            int j = i - 1;
            while(j >= 0 && current < mm[j]) {
                mm[j+1] = mm[j];
                j--;
            }
            mm[j+1] = current;
        }
        for (int i = 0; i < mm.length; i++) System.out.print(mm[i] + " ");

        System.out.println();
        System.out.println();

        Random randDouble = new Random();
        double[] mr = new double[10];
        for (int i = 0; i < mr.length; i++)
        {
            mr[i] = randDouble.nextDouble(1.0,10.0);
            System.out.print(mr[i] + " ");
        }
        System.out.println();
        for (int i = 1; i < mr.length; i++) {
            double current = mr[i];
            int j = i - 1;
            while(j >= 0 && current < mr[j]) {
                mr[j+1] = mr[j];
                j--;
            }
            mr[j+1] = current;
        }
        for (int i = 0; i < mr.length; i++) System.out.print(mr[i] + " ");
    }
}
