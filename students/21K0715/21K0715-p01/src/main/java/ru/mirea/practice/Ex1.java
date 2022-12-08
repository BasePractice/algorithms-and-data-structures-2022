package ru.mirea.practice;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        float[] array = new float[10];
        float sum = 0;
        float average;
        Scanner scanner = new Scanner(System.in);
        for (int i=0; i<10; i++) {
            array[i] = scanner.nextFloat();
            sum += array[i];
        }
        average = sum / 10;
        System.out.println("Sum = " + (int)sum + " Average = " + average);
    }
}