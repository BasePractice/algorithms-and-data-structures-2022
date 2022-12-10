package ru.mirea.practice.s21k0706.p1;

public final class Tester {
    private Tester() {

    }

    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(2, 3, 1, 4);
        movablePoint.moveUp();
        movablePoint.moveRight();
        System.out.println(movablePoint);
        MovableCircle movableCircle = new MovableCircle(7, 2, 2, 5, 17);
        movableCircle.moveDown();
        movableCircle.moveLeft();
        System.out.println(movableCircle);
    }
}

