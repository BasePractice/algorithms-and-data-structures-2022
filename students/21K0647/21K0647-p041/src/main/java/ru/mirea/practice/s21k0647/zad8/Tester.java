package ru.mirea.practice.s21k0647.zad8;

public final class Tester {
    private Tester() {

    }

    public static void main(String[] args) {
        Shape square1 = new Circle("blue", true, 13);
        Shape square2 = new Rectangle("yellow", false, 5, 10);
        Shape square3 = new Square("black", true, 25);
        System.out.println(square1 + "\n");
        System.out.println(square2 + "\n");
        System.out.println(square3 + "\n");


    }

}
