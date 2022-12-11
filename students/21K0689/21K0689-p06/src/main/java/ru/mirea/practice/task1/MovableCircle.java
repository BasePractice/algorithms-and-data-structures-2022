package ru.mirea.practice.task1;

public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;

    public MovableCircle(int radius, MovablePoint center) {
        this.radius = radius;
        this.center = center;
    }

    @Override
    public void moveUP() {
        center.moveUP();

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

    @Override
    public String toString() {
        return "MovableCircle{" + "radius=" + radius + ", center=" + center + '}';
    }
}
