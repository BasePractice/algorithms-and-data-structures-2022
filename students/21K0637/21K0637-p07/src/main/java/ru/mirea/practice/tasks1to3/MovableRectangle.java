package ru.mirea.practice.tasks1to3;

public class MovableRectangle implements Movable {
    private final MovablePoint topLeft;
    private final MovablePoint bottomRight;

    public MovableRectangle(MovablePoint topLeft, MovablePoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    @Override
    public void up(int value) {
        topLeft.up(value);
        bottomRight.up(value);
    }

    @Override
    public void down(int value) {
        topLeft.down(value);
        bottomRight.down(value);
    }

    @Override
    public void right(int value) {
        topLeft.right(value);
        bottomRight.right(value);
    }

    @Override
    public void left(int value) {
        topLeft.left(value);
        bottomRight.left(value);
    }

    @Override
    public String toString() {
        return "MovableRectangle{"
            + "topLeft=" + topLeft
            + ", bottomRight=" + bottomRight
            + '}';
    }
}
