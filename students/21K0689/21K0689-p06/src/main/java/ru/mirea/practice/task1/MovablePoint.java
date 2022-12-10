package ru.mirea.practice.task1;

public class MovablePoint implements Movable {
    protected int x;
    protected int y;

    protected int xSpeed;
    protected int ySpeed;


    public MovablePoint(int x, int y, int xspeed, int yspeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xspeed;
        this.ySpeed = yspeed;
    }

    @Override
    public void moveUP() {
        this.y += ySpeed;
    }

    @Override
    public void moveDown() {
        this.y -= ySpeed;
    }

    @Override
    public void moveLeft() {
        this.x -= ySpeed;
    }

    @Override
    public void moveRight() {
        this.x += ySpeed;
    }

    @Override
    public String toString() {
        return "MovablePoint{" + "x=" + x + ", y=" + y + ", xSpeed=" + xSpeed + ", ySpeed=" + ySpeed + '}';
    }
}
