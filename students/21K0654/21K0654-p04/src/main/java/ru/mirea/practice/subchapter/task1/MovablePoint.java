package ru.mirea.practice.subchapter.task1;

public class MovablePoint implements Movable {

    protected int x;
    protected int y;
    protected int xspeed;
    protected int yspeed;

    MovablePoint(int x, int y, int xspeed, int yspeed) {
        this.x = x;
        this.y = y;
        this.xspeed = xspeed;
        this.yspeed = yspeed;
    }

    @Override
    public void moveUp() {
        this.y += 1;
    }

    @Override
    public void moveDown() {
        this.y -= 1;
    }

    @Override
    public void moveLeft() {
        this.x -= 1;
    }

    @Override
    public void moveRight() {
        this.x += 1;
    }

    @Override
    public String toString() {
        return "X:" + this.x + " Y:" + this.y + " xSpeed:" + this.xspeed + " ySpeed:" + this.yspeed;
    }
}
