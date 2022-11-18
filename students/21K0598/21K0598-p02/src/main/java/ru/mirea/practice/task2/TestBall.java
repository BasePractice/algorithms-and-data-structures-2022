package ru.mirea.practice.task2;

import java.util.Scanner;

abstract class TestBall {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double x = 0.0;
            double y = 0.0;
            Ball ball1 = new Ball(x, y);
            System.out.println(ball1.getX());
            System.out.println(ball1.getY());
            System.out.print("Введите x: ");
            x = sc.nextInt();
            System.out.print("Ввеите y: ");
            y = sc.nextInt();
            Ball ball = new Ball(x, y);
            ball1.setX(x);
            System.out.println(ball.getX());
            ball.setY(y);
            System.out.println(ball.getY());
        }
    }
}
