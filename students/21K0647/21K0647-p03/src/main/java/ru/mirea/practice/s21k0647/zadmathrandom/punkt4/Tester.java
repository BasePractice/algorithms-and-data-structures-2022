package ru.mirea.practice.s21k0647.zadmathrandom.punkt4;

import java.util.ArrayList;
import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {

        Scanner sourse = new Scanner(System.in);
        int n = -10;
        while (n < 1) {
            n = sourse.nextInt();
            if (n < 1) {
                System.out.println("Enter a number greater than 0.");
            }
        }
        int[] array1 = new int[n];
        ArrayList<Integer> array2 = new ArrayList<Integer>();
        for (int x: array1) {
            x = (int) Math.round((Math.random() * (n + 1)));
            System.out.print(x + " ");
            if (x % 2 == 0) {
                array2.add(x);
            }
        }
        System.out.println();
        for (int x: array2) {
            System.out.print(x + " ");
        }

    }
}

//пункт 5 такой же