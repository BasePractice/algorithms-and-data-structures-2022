package ru.mirea.practice.ex3;

public class Main {
    public static void main(String[] args) {
        Tester tester = new Tester(5);
        tester.insert(3, new Circle());
        System.out.println(tester);
    }
}
