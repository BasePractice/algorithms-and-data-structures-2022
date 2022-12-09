package ru.mirea.practice.task2;

import ru.mirea.practice.task1.Movable;

public class MovablePoint implements Movable {
    protected int x;
    protected int y;
    protected int xSpeed;
    protected int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }


    @Override
    public void moveUp() {
        y += ySpeed;
    }

    @Override
    public void moveDown() {
        y -= ySpeed;
    }

    @Override
    public void moveRight() {
        x += xSpeed;
    }

    @Override
    public void moveLeft() {
        x -= xSpeed;
    }

    @Override
    public String toString() {
        return "MovablePoint{"
                + "x=" + x
                + ", y=" + y
                + ", x's speed=" + xSpeed
                + ", y's speed=" + ySpeed
                + '}';
    }
}