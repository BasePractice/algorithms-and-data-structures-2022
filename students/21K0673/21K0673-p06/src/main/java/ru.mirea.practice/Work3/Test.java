package ru.mirea.practice.Work3;

public class Test implements Nameable {
    private String name;

    Test(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public static void main(String[] args) {
        Test test = new Test("hovmdslvk");
        System.out.println(test.getName());
    }
}