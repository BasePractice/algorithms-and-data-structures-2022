package ru.mirea.practice.task3;

public abstract class Main {
    public static void main(String[] args) {
        Planet venus = new Planet("Venus", 4.86 * Math.pow(10, 24));
        System.out.println(venus.getName());
    }
}
