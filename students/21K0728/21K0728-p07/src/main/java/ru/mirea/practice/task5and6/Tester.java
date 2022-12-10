package ru.mirea.practice.task5and6;

public abstract class Tester {
    public static void main(String[] args) {
        StringFunc procStr = new ProcessStrings("Override");
        System.out.println(procStr.length());
        System.out.println(procStr.reverse());
        System.out.println(procStr.deleteEvenNumber());

    }
}
