package ru.mirea.practice.task1;

import ru.mirea.practice.task2and3.Movable;

public class MovablePoint implements Movable {
    protected int x;
    protected int y;
    protected int xSpeed;
    protected int ySpeed;

    public MovablePoint(int x, int y, int xspeed, int yspeed) {
        this.x = x;
        this.xSpeed = xspeed;
        this.y = y;
        this.ySpeed = yspeed;
    }


    @Override
    public String toString() {
        return "MovablePoint{" + "x=" + x + ", y=" + y + ", xSpeed=" + xSpeed + ", ySpeed=" + ySpeed + '}';
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
        x += xSpeed;
    }
}
