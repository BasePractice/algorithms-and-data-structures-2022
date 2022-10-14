package ru.mirea.practice;

class MovableCircle implements Movable {
    private MovablePoint a;
    private int radius;

    MovableCircle() {}

    MovableCircle(MovablePoint a,int radius, int xspeed, int yspeed) {
        this.a = new MovablePoint(a.x,a.y, xspeed, yspeed);
        this.radius = radius;
    }

    public void moveUp() {
        a.moveUp();
    }

    public void moveDown() {
        a.moveDown();
    }

    public void moveRight() {
        a.moveRight();
    }

    public void moveLeft() {
        a.moveUp();
    }

    public String toString() {
        return "Circle with center in " + a + " with radius = " + radius;
    }
}