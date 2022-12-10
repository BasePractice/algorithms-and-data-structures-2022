package ru.mirea.practice.task1;

abstract class Main {
    public static void main(String[] args) {
        int a1 = 0;
        float a2 = 0;
        String a3 = "ase";
        MyClass m = new MyClass(a1, a2, a3);
        m.printNames();
    }
}
