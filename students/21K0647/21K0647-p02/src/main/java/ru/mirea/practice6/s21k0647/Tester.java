package ru.mirea.practice6.s21k0647;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        double r;
        Circle k1 = new Circle(3.1, 4.1, 5.1, "red");
        System.out.println("Длина окружности = " + k1.getLength() + "см\n");
        Scanner source = new Scanner(System.in);
        System.out.println("Введите радиус ");
        r = source.nextDouble();
        k1.setR(r);
        System.out.println("Длина окружности = " + k1.getLength() + "см");
        System.out.println("Площадь круга = " + k1.square() + "см^2");
        Circle k2 = new Circle(2, 10, 9, "blue");
        System.out.println(k1.twoCircle(k2));
    }
}
