package ru.mirea.practice.s21k0647.punkt123;

public final class Tester {
    private Tester() {

    }

    public static void main(String[] args) {
        MyClass<String, Dog, Double> variable = new MyClass<>("Hello", new Dog("Doberman", 8, "wrestling"), 39.2);
        System.out.println(variable);
    }
}
