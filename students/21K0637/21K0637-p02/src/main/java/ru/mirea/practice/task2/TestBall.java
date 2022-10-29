package ru.mirea.practice.task2;

public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball(10, 5);
        for (int i = 0; i < 5; i++) {
            ball.move(3 * i, -2 * i);
            System.out.println(ball);
        }

        ball.setXY(0, 0);
        System.out.println(ball);
    }
}
