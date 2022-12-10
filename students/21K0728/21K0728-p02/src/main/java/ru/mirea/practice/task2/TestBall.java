package ru.mirea.practice.task2;

import java.util.Scanner;

abstract class TestBall {

    public static void main(String[] args) {
        Ball ball = new Ball(7, 2);
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println(ball);
            System.out.println("Enter new coordinates: ");
            ball.setXY(scan.nextInt(), scan.nextInt());
            System.out.println(ball);
            System.out.println("Enter move coordinates: ");
            ball.move(scan.nextInt(), scan.nextInt());
            System.out.println(ball);
        }
    }
}
