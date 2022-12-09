package mirea.practice.s21k0723.mathrandom.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public abstract class RandomClass {
    public static void main(String[] args) {
        ArrayList<Double> doubleArrayList = new ArrayList<Double>();
        Random rand = new Random();
        int nextInt = rand.nextInt(20);
        System.out.println(nextInt);
        for (int i = 0; i < nextInt;i++) {
            doubleArrayList.add(Math.random() * 10);
        }
        for (Double i: doubleArrayList) {
            System.out.print(i + " ");
        }
        Collections.sort(doubleArrayList);
        System.out.println();
        for (Double i: doubleArrayList) {
            System.out.print(i + " ");
        }
    }
}
