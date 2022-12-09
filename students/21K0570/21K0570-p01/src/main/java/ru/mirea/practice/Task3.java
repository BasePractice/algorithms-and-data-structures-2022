package ru.mirea.practice;

abstract class ClassThree {
    public static void main(String[] args) {
        System.out.printf("Аргументов: %d\n", args.length);
        for (String i : args) {
            System.out.printf("%s\n", i);
        }
    }
}