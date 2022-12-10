package ru.mirea.practice.task2;

public class MovableRectangle implements Movable {
    public MovablePoint topLeft;
    public MovablePoint bottomRight;

    public MovableRectangle(MovablePoint topLeft, MovablePoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
        speed();
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

    public void speed() {
        if (bottomRight.ySpeed != topLeft.ySpeed) {
            bottomRight.ySpeed = topLeft.ySpeed;
        }
        if (bottomRight.xSpeed != topLeft.xSpeed) {
            bottomRight.xSpeed = topLeft.xSpeed;
        }
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }
}
