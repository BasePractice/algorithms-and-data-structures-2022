package ru.mirea.workseven.task23;

class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;


    public void speedTest(int xspeed, int yspeed) {
        if (xspeed == yspeed) {
            System.out.print("Error!\nXspeed != Yspeed");
            System.exit(0);
        }
    }

    MovableRectangle(MovablePoint topLeft, MovablePoint bottomRight, int xspeed, int yspeed) {
        this.topLeft = new MovablePoint(topLeft.x, topLeft.y, xspeed, yspeed);
        this.bottomRight = new MovablePoint(bottomRight.x, bottomRight.y, xspeed, yspeed);
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
    public void moveRight() {
        topLeft.moveRight();
        bottomRight.moveRight();
    }

    @Override
    public void moveLeft() {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    public String getName() {
        return MovableRectangle.class.getName();
    }


    public void intTostring() {
        String strBottomRightx = Integer.toString(this.bottomRight.x);
        String strBottomRighty = Integer.toString(this.bottomRight.y);
        String strtopLeftx = Integer.toString(this.topLeft.x);
        String strtopLefty = Integer.toString(this.topLeft.y);
        System.out.println(strBottomRightx + " " + strBottomRighty + "\n" + strtopLeftx + " " + strtopLefty);
    }

    @Override
    public String toString() {
        return "Rectangle: \n" + "topLeft " + topLeft + ", bottomRight " + bottomRight;
    }
}
