package ru.mirea.practice.solutiontask2;

public final class TestBall {
    private TestBall() {}

    public static void main(String[] args) {
        Ball ballFirst = new Ball();
        Ball ballSecond = new Ball(5.0, 10.0);

        System.out.println(ballFirst);
        System.out.println(ballSecond);

        System.out.println(ballSecond.getX());
        System.out.println(ballSecond.getY());

        ballSecond.setX(10.0);
        ballSecond.setY(5.0);
        System.out.println(ballSecond);

        ballFirst.setXY(7.0, 13.0);
        System.out.println(ballFirst);

        ballFirst.move(-10, 0);
        ballSecond.move(17, -17);
        System.out.println(ballFirst);
        System.out.println(ballSecond);
    }
}
