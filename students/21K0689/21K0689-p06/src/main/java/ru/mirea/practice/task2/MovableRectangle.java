package ru.mirea.practice.task2;

import ru.mirea.practice.task1.Movable;
import ru.mirea.practice.task1.MovablePoint;

public class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int x2, int y1, int y2, int xspeed, int yspeed) {
        this.topLeft = new MovablePoint(x1, xspeed, y1, yspeed);
        this.bottomRight = new MovablePoint(x2, xspeed, y2, yspeed);
    }

    @Override
    public void moveUP() {
        topLeft.moveUP();
        bottomRight.moveUP();
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
        return "MovableRectangle{" + "topLeft=" + topLeft + ", bottomRight=" + bottomRight + '}';
    }
}
