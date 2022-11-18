package ru.mirea.practice.s21K0703.lab2.t2;

public class TestBall {
    public static void testBall() {
        Ball ball = new Ball(2, 3);

        System.out.println(ball.getX());
        System.out.println(ball.getY());
    }

    public static void testBall1() {
        Ball ball = new Ball();

        ball.setX(5);
        ball.setY(4);

        System.out.println(ball.getX());
        System.out.println(ball.getY());
    }
}
