package ru.mirea.practice.subchapter.task1;

public class MovableCircle extends MovablePoint implements Movable {
    private int r;
    private MovablePoint c;

    public MovableCircle(int r, int x, int y, int xspeed, int yspeed) {
        super(x, y, xspeed, yspeed);
        this.c = new MovablePoint(x, y, xspeed, yspeed);
        this.r = r;
    }

    @Override
    public void moveUp() {
        c.moveUp();
    }

    @Override
    public void moveDown() {
        c.moveDown();
    }

    @Override
    public void moveLeft() {
        c.moveLeft();
    }

    @Override
    public void moveRight() {
        c.moveRight();
    }

    @Override
    public String toString() {
        return c.toString() + " Radius:" + this.r;
    }
}
