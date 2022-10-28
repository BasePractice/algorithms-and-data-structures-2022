
package ru.mirea.practice.task2;

abstract class Program2 {
    public static void main(String[] args) {
        int sum = 0;
        int[] massive = new int[]{1, 2, 0, 4, 5};
        int i = 0;
        int max = massive[0];
        int min = massive[0];
        while (i < 5) {
            sum += massive[i];
            if (massive[i] > max) {
                max = massive[i];
            }
            if (massive[i] < min) {
                min = massive[i];
            }
            i++;

        }
        System.out.println(sum + " " + min + " " + max);
    }
}