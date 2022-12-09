package ru.mirea.practice.math_random.ex2;

public class Main {
    public static void main(String[] args) {
        Tester tester = new Tester(5);
        for (int i = 0; i < 5; i++) {
            tester.insert(i, new Circle());
        }
        System.out.println(tester);
        tester.sort();
        System.out.println(tester);
    }
}
