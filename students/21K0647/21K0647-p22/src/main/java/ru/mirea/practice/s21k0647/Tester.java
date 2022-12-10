package ru.mirea.practice.s21k0647;

public final class Tester {
    private Tester() {

    }

    public static void main(String[] args) {
        Rpn test = new Rpn();
        double h1;
        h1 = 2 / (3 - (4 + 5 * 6));
        test.calculate("2 3 4 5 6 * + - /");
        System.out.println("Проверка: " + h1);
        double h2;
        h2 = 2 * 3 + 4 * 5;
        test.calculate("2 3 * 4 5 * +");
        System.out.println("Проверка: " + h2);
        double h3;
        h3 = 2 + 3;
        test.calculate("2 3 +");
        System.out.println("Проверка: " + h3);
        test.calculate("2 0 /");
    }
}
