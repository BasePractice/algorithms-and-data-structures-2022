package ru.mirea.practice.task2and3;


public class MovableRectangle implements Movable {
    private MovablePoint bottomRight;
    private MovablePoint topLeft;

    public MovableRectangle(int x1, int x2, int y1, int y2, int x1Speed, int y1Speed, int x2Speed, int y2Speed) {
        bottomRight = new MovablePoint(x1, y1, x1Speed, y1Speed);
        topLeft = new MovablePoint(x2, y2, x2Speed, y2Speed);
        speedTest();
    }

    private void speedTest() {
        if (topLeft.xSpeed != bottomRight.xSpeed) {
            topLeft.xSpeed = bottomRight.xSpeed;
        }
        if (topLeft.ySpeed != bottomRight.ySpeed) {
            topLeft.ySpeed = bottomRight.ySpeed;
        }
    }

    @Override
    public void moveUp() {
        bottomRight.moveUp();
        topLeft.moveUp();
    }

    @Override
    public void moveDown() {
        bottomRight.moveDown();
        topLeft.moveDown();
    }

    @Override
    public void moveLeft() {
        bottomRight.moveLeft();
        topLeft.moveLeft();
    }

    @Override
    public void moveRight() {
        bottomRight.moveRight();
        topLeft.moveRight();
    }
}
