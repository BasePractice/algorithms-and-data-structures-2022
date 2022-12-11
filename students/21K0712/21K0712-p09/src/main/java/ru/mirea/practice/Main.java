package ru.mirea.practice;

abstract class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.print();
        student.sort();
        System.out.println();
        student.print();
    }
}
