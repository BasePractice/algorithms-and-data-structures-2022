package ru.mirea.practice;

// 6. Написать программу, в результате работы которой выводятся на экран
//первые 10 чисел гармонического ряда (форматировать вывод).

public final class Task4 {

    private Task4() {
    }

    public static void main(String[ ] args) {
        for (int i = 0; i < 10; i++) {
            System.out.printf("Elem %d : %s%n", i, Math.pow(2, -i));
        }
    }
}