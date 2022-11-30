package ru.mirea.practice.work8;

abstract class Test {
    public static void main(String[] args) {
        int n = 5;
        String[] a = {"a", "b", "c", "d", "e"};
        Sort b = new Sort();
        b.print(a, n);
        System.out.println("\n");
        b.print(b.sort(a, n), n);
    }
}
