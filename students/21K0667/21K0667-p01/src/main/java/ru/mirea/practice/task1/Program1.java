package ru.mirea.practice.task1;


abstract class Program1 {
    public static void main(String[] args) {
        int sum = 0;
        int avSum;
        int[] massive = new int[]{1, 2, 3, 4, 5};
        for (int j : massive) {
            sum += j;
        }
        avSum = sum / 5;
        System.out.println(sum + " " + avSum);
    }
}