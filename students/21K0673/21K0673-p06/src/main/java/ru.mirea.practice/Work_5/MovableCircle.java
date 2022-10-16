package ru.mirea.practice.Work_5;

public class MovableCircle extends MovablePoint {
    private int radius;
    private MovablePoint center;
    MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius, MovablePoint center) {
        super(x, y, xSpeed, ySpeed);
    }
    public String toString() {
        return "MovableCircle: {center: "+center+", radius = "+radius+"}";
    }
    public void moveUp() {
        this.y++;
    }

    public void moveDown() {
        this.y--;
    }

    public void moveLeft() {
        this.x--;
    }

    public void moveRight() {
        this.x++;
    }
}
