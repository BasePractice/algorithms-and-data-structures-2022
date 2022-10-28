package ru.mirea.practice.task2;

public class Main {
    public static void main(String[] args) {
        Tester tester = new Tester();
        tester.allCircles();
        System.out.println("\n");
        tester.findMax();
        tester.findMin();

        System.out.println("\nСортировка окружностей\n");
        tester.toSort();
        tester.allCircles();
    }

}
