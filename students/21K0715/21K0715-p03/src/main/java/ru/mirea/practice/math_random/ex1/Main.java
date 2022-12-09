package ru.mirea.practice.math_random.ex1;

import java.util.Random;


public class Main {
    public static void main(String[] args) {
        double[] randomArray = new double[10];
        for (int i=0; i<randomArray.length/2; i++) {
            randomArray[i] =  Math.random() * 1000;
            System.out.println(randomArray[i]);
        }
        Random randomObj = new Random();
        for (int i=randomArray.length/2; i<randomArray.length;i++) {
            randomArray[i] = randomObj.nextDouble() * 1000;
            System.out.println(randomArray[i]);
        }
        System.out.println();
//        sort(randomArray);
        for (double element:
             randomArray) {
            System.out.println(element);
        }

    }
}
