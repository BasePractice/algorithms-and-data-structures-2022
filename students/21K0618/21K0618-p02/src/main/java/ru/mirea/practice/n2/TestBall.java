package ru.mirea.practice.n2;

import java.util.InputMismatchException;
import java.util.Scanner;

abstract class TestBall {
    public static void main(String[] args) {
        Scanner putin = new Scanner(System.in);
        try {
            double x;
            System.out.println("Введите координаты мяча \nx = ");
            Ball bal = new Ball();

            x = putin.nextDouble();
            bal.setX(x);
            System.out.println("y = ");
            double y;
            y = putin.nextDouble();
            bal.setY(y);
            System.out.println("Текущее положение мяча: " + bal);
            System.out.println("Куда вы хотите сдвинуть мяч?\nПо x на ");
            x = putin.nextDouble();
            System.out.println("По y на ");
            y = putin.nextDouble();
            bal.move(x, y);
            System.out.println("Новое положение мяча: " + bal);

        } catch (InputMismatchException e) {
            System.out.println("Error");
            putin.nextInt();
        } finally {
            putin.close();
        }
    }
}

