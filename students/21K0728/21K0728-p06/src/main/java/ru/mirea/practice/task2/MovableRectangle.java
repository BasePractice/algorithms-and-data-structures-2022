package ru.mirea.practice.task2;

class MovableRectangle implements Movable {
    public MovablePoint leftTop;
    public MovablePoint rightBottom;


    public void check(int xSpeed, int ySpeed) {
        if (xSpeed == ySpeed) {
            System.out.print("Error!\nx's speed != y's speed");
            System.exit(0);
        }
    }

    MovableRectangle(MovablePoint leftTop, MovablePoint rightBottom, int xSpeed, int ySpeed) {
        this.leftTop = new MovablePoint(leftTop.x, leftTop.y, xSpeed, ySpeed);
        this.rightBottom = new MovablePoint(rightBottom.x, rightBottom.y, xSpeed, ySpeed);
    }

    @Override
    public void moveUp() {
        leftTop.moveUp();
        rightBottom.moveUp();
    }

    @Override
    public void moveDown() {
        leftTop.moveDown();
        rightBottom.moveDown();
    }

    @Override
    public void moveRight() {
        leftTop.moveRight();
        rightBottom.moveRight();
    }

    @Override
    public void moveLeft() {
        leftTop.moveLeft();
        rightBottom.moveLeft();
    }

    @Override
    public String toString() {
        return "Left Top " + leftTop + ", Right Bottom " + rightBottom;
    }
}