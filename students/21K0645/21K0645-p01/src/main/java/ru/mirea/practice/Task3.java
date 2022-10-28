package ru.mirea.practice;

// 5. Написать программу, в результате которой выводятся на экран
//аргументы командной строки в цикле for.

public final class Task3 {

    private Task3() {
    }

    public static void main(String [] args) {
        for (String arg : args) {
            System.out.println(arg);
        }
    }
}

