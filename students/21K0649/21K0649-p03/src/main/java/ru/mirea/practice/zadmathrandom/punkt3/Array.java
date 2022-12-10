package ru.mirea.practice.zadmathrandom.punkt3;


public final class Array {
    private Array() {

    }

    public static void main(String[] args) {
        int[] array = new int[4];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round(Math.random() * 89 + 10);
            System.out.print(array[i] + " ");
        }
        int k = 0;
        for (int i = 0; i < 3; ++i) {
            if (array[i] > array[i + 1]) {
                k++;
            }
        }
        if (k == 0) {
            System.out.println("Strictly increasing");
        }
    }
}
