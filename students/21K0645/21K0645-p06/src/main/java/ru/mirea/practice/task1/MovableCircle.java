package ru.mirea.practice.task1;

/* Напишите два класса MovablePoint и MovableCircle - которые
реализуют интерфейс Movable */

public class MovableCircle implements Movable {
    private final int radius;
    private final MovablePoint center;

    public MovableCircle(int x, int y, int xspeed, int yspeed, int radius) {
        this.radius = radius;
        center = new MovablePoint(x, y, xspeed, yspeed);
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

    @Override
    public String toString() {
        return "MovableCircle{" + "radius=" + radius + ", center=" + center + '}';
    }
}
