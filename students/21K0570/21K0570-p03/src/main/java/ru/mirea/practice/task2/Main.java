package ru.mirea.practice.task2;

public abstract class Main {
    public static void main(String[] args) {
        Tester tester = new Tester();
        tester.printAllCircles();
        System.out.println();
        tester.max();
        tester.min();
        System.out.println("Sort");
        tester.sort();
        tester.printAllCircles();
    }
}
