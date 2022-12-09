package ru.mirea.practice.task1;

import java.util.Arrays;
import java.util.Random;

abstract class RandomList {
    public static void main(String[] args) {
        float[] randomNumbers = new float[10];
        Random rand = new Random();
        System.out.println("Метод random()");
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = (float)Math.random() * 10;
        }
        for (float randomNumber : randomNumbers) {
            System.out.print(randomNumber + ", ");
        }
        System.out.println(" ");
        Arrays.sort(randomNumbers);
        for (float randomNumber : randomNumbers) {
            System.out.println(randomNumber + ", ");
        }
        System.out.println("Класс Random");
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = rand.nextFloat(10);
        }
        for (float randomNumber : randomNumbers) {
            System.out.print(randomNumber + ", ");
        }
        System.out.println(" ");
        Arrays.sort(randomNumbers);
        for (float randomNumber : randomNumbers) {
            System.out.println(randomNumber + ", ");
        }
    }
}
