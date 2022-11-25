package ru.mirea.practice.task3;

abstract class Main {
    public static void main(String[] args) {
        System.out.printf("Аргументов: %d\n", args.length);
        for (String i : args) {
            System.out.printf("%s\n", i);
        }
    }
}
