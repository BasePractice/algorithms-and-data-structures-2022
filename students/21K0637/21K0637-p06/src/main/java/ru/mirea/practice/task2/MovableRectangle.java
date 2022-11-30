package ru.mirea.practice.task2;

import ru.mirea.practice.task1.Movable;
import ru.mirea.practice.task1.MovablePoint;

public class MovableRectangle implements Movable {
    private final MovablePoint topLeft;
    private final MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xspeed, int yspeed) {
        topLeft = new MovablePoint(x1, y1, xspeed, yspeed);
        bottomRight = new MovablePoint(x2, y2, xspeed, yspeed);
    }

    @Override
    public void moveUp() {
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    @Override
    public void moveDown() {
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    @Override
    public void moveLeft() {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    @Override
    public void moveRight() {
        topLeft.moveRight();
        bottomRight.moveRight();
    }

    @Override
    public String toString() {
        return "MovableRectangle{"
            + "topLeft=" + topLeft
            + ", bottomRight=" + bottomRight
            + '}';
    }
}
