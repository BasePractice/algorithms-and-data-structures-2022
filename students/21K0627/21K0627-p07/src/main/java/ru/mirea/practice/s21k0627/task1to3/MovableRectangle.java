package ru.mirea.practice.s21k0627.task1to3;

public class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int x1Speed, int y1Speed, int x2Speed, int y2Speed) {
        topLeft = new MovablePoint(x1, y1, x1Speed, y1Speed);
        bottomRight = new MovablePoint(x2, y2, x2Speed, y2Speed);
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
}
