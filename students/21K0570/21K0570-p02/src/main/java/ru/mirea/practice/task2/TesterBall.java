package ru.mirea.practice.task2;

import java.util.Scanner;

public final class TesterBall {
    private TesterBall() {
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            Ball ball = new Ball(0.0, 0.0);

            System.out.println("X, Y coordinates: " + ball.getX() + " " + ball.getY());
            System.out.println("Enter new X, Y coordinates: ");
            ball.setX(in.nextDouble());
            ball.setY(in.nextDouble());
            ball.move(ball.getX(), ball.getY());
            System.out.println(ball);

            System.out.println("Enter another X, Y coordinates");
            double newX = in.nextDouble();
            double newY = in.nextDouble();
            ball.setXY(newX, newY);
            ball.move(ball.getX(), ball.getY());
            System.out.println(ball);
        } finally {
            in.close();
        }
    }

}