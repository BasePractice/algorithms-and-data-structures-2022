package ru.mirea.practice.tasks1to3;

public class MovablePoint implements Movable {
    protected int x;
    protected int y;

    public MovablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public void up(int value) {
        this.y += value;
    }

    @Override
    public void down(int value) {
        this.y -= value;
    }

    @Override
    public void right(int value) {
        this.x += value;
    }

    @Override
    public void left(int value) {
        this.x -= value;
    }

    @Override
    public String toString() {
        return "MovablePoint{"
            + "x=" + x
            + ", y=" + y
            + '}';
    }
}
