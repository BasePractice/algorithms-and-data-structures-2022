package ru.mirea.practice.task2;

abstract class TestBall {
    public static void main(String[] args) {
        Ball b = new Ball(1.0, 2.0);
        b.move(3.0, 4.0);
        System.out.println(b);
    }
}
