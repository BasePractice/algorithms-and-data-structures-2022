package ru.mirea.practice.s21k0706.p2;

public final class Tester {
    private Tester() {

    }

    public static void main(String[] args) {
        MovableRectangle movableRectangle = new MovableRectangle(6, 2,8, 0, 10, 7);
        movableRectangle.moveUp();
        movableRectangle.moveRight();
        System.out.println(movableRectangle);
    }
}
