package ru.mirea.practice.n1to3;

abstract class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.print();
        student.sort();
        System.out.println();
        student.print();
    }
}
