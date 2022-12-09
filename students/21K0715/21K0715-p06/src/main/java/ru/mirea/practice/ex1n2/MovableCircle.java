package ru.mirea.practice.ex1n2;

public class MovableCircle implements Movable {
    private final int radius;
    private final MovablePoint center;

    public MovableCircle(int x, int y, int xspeed, int yspeed, int radius) {
        this.radius = radius;
        this.center = new MovablePoint(x, y, xspeed, yspeed);
    }

    @Override
    public String toString() {
        return "MovableCircle{"
            + "radius=" + radius
            + ", center=" + center
            + '}';
    }

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }
}
