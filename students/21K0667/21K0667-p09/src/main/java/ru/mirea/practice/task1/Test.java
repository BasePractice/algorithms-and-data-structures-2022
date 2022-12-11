package ru.mirea.practice.task1;

public abstract class Test {
    public static void main(String[] args) {
        int[] ids = new int[]{11, 43, 61, 67, 5, 10};
        Student test = new Student(ids);
        test.print();
        test.sort();
        System.out.println();
        test.print();
    }

}
