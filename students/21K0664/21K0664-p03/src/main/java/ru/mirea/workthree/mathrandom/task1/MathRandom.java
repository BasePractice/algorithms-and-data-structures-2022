package ru.mirea.workthree.mathrandom.task1;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

abstract class MathRandom {
    public static void main(String[] args) {
        //1.1
        Scanner in = new Scanner(System.in);
        try {
            int n = in.nextInt();
            Random rand = new Random();
            double[] array = new double[n];
            double[] arrayq = new double[n];
            for (int i = 0; i < n; i++) {
                array[i] = rand.nextDouble();
            }
            for (int i = 0; i < n; i++) {
                arrayq[i] = ThreadLocalRandom.current().nextDouble();
            }
            for (int i = 0; i < n; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.print("\n \n");
            for (int i = 0; i < n; i++) {
                System.out.print(arrayq[i] + " ");
            }
            System.out.print("\n \n \n");
            Arrays.sort(array);
            Arrays.sort(arrayq);
            System.out.print("Остортированный массив:");
            System.out.print("\n");
            for (int i = 0; i < n; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.print("\n \n");
            for (int i = 0; i < n; i++) {
                System.out.print(arrayq[i] + " ");
            }
        } catch (InputMismatchException e) {
            System.out.println("Error");
            in.nextInt();
        } finally {
            in.close();
        }
    }

}

