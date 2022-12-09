package ru.mirea.practice.task2;

public abstract class TestBall {
    public static void main(String[] a) {
        Ball ball = new Ball(20, 40);
        System.out.println(ball);
        ball.setX(25);
        ball.setY(35);
        System.out.println(ball);
        ball.setXY(26, 26);
        System.out.println(ball);
        ball.move(14, 18);
    }
}
