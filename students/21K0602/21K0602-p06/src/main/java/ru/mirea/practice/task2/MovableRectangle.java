package ru.mirea.practice.task2;


public class MovableRectangle implements Movable {
    private MovablePoint bottomRight;
    private MovablePoint topLeft;

    public MovableRectangle(int x1, int x2, int y1, int y2, int x1Speed, int y1Speed, int x2Speed, int y2Speed) {

        bottomRight = new MovablePoint(x1, y1, x1Speed, y1Speed);
        topLeft = new MovablePoint(x2, y2, x2Speed, y2Speed);
        speedEquals();
    }

    private void speedEquals() {
        if (bottomRight.xspeed != topLeft.xspeed) {
            bottomRight.xspeed = topLeft.xspeed;
        }
        if (bottomRight.yspeed != topLeft.yspeed) {
            bottomRight.yspeed = topLeft.yspeed;
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

    @Override
    public String toString() {
        return "MovableRectangle{" + "bottomRight=" + bottomRight + ", topLeft=" + topLeft + '}';
    }
}
