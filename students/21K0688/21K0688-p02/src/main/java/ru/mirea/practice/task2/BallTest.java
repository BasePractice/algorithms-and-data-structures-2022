package ru.mirea.practice.task2;

import java.util.Scanner;

abstract class BallTest {
    public static void main(String[] args) {
        Ball ball = new Ball();
        System.out.println(ball.toString());

        int op = 0;
        System.out.print("Do u want to change information about ball?(1/0) ");
        try (Scanner sc = new Scanner(System.in)) {
            op = sc.nextInt();

            if (op == 1) {
                double x1;
                System.out.print("x: ");
                x1 = sc.nextDouble();
                System.out.print("y: ");
                double y1;
                y1 = sc.nextDouble();
                ball.setXY(x1, y1);
                System.out.println(ball.toString());
            }
        }
    }
}
