package ru.mirea.practice.task5to6;

public abstract class Tester {
    public static void main(String[] args) {
        ProcessString stringAnalyse = new StringWorker("hello world");
        System.out.println(stringAnalyse.length());
        System.out.println(stringAnalyse.reverse());
        System.out.println(stringAnalyse.oddCharacters());
    }
}
