package ru.mirea.worksix.task2;

class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    MovableRectangle() {}

    public void check(int xspeed, int yspeed) {
        if (xspeed == yspeed) {
            System.out.print("Error!\nXspeed != Yspeed");
            System.exit(0);
        }
    }

    MovableRectangle(MovablePoint topLeft, MovablePoint bottomRight, int xspeed, int yspeed) {
        this.topLeft = new MovablePoint(topLeft.x, topLeft.y, xspeed, yspeed);
        this.bottomRight = new MovablePoint(bottomRight.x, bottomRight.y, xspeed, yspeed);
    }

    public void moveUp() {
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    public void moveDown() {
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    public void moveRight() {
        topLeft.moveRight();
        bottomRight.moveRight();
    }

    public void moveLeft() {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    public String toString() {
        return "topLeft " + topLeft + ", bottomRight " + bottomRight;
    }
}
