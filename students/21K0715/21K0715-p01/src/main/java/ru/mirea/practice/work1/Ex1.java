package ru.mirea.practice.work1;

import java.util.Scanner;

public final class Ex1 {
    public static final int N = 10;

    private Ex1() {

    }

    public static void main(final String[] args) {
        float[] array = new float[N];
        float sum = 0;
        float average;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextFloat();
            sum += array[i];
        }
        scanner.close();
        average = sum / N;
        System.out.println("Sum = " + (int) sum + " Average = " + average);
    }
}
