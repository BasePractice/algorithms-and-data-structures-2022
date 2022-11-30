package ru.mirea.practice;

abstract class Task1 {
    public static void main(String[] args) {
        try {
            int[] a = {1, 23, 4, 235, 246, 123};
            double sum = 0;
            double average;
            for (int j : a) {
                System.out.print(j + ", ");
                sum += j;
            }
            System.out.println();
            average = sum / a.length;
            System.out.println("sum = " + sum);
            System.out.println("average = " + average);
        } catch (IncompatibleClassChangeError e) {
            System.out.println("Error");
        }
    }
}
