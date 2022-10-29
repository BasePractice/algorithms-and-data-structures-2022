package ru.mirea.practice.task1;

public class Main {
    public static void main(String[] args) {
        RandomNumbers num = new RandomNumbers();
        num.mathRandomArray(10);
        num.randomArray(10);
        num.bubbleSort(num.mathRandomArray(10));
    }
}
