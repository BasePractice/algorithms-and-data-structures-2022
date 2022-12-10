package ru.mirea.practice.s21k0709.task1;

public abstract class Tester {
    public static void main(String[] args) {
        ComplexAbstractFactory factory = new ConcreteFactory();
        Complex complex1 = factory.createComplex(1,2);
        System.out.println(complex1);
        Complex complex2 = factory.createComplex();
        System.out.println(complex2);
    }
}
