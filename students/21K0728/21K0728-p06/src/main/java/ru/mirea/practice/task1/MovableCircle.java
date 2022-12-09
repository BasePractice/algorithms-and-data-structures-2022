package ru.mirea.practice.task1;

public class MovableCircle implements Movable {
    private MovablePoint centr;
    private double rad;

    public double getRad() {
        return rad;
    }

    public void setRad(double rad) {
        this.rad = rad;
    }

    public MovableCircle(int x, int y, int xSpeed, int ySpeed) {
        centr = new MovablePoint(x, y, xSpeed, ySpeed);
    }

    @Override
    public void moveUp() {
        centr.moveUp();
    }

    @Override
    public void moveDown() {
        centr.moveDown();
    }

    @Override
    public void moveRight() {
        centr.moveRight();
    }

    @Override
    public void moveLeft() {
        centr.moveLeft();
    }
}
