package ru.mirea.practice.task2;

public class Ball {
    private double x;
    private double y;

    public Ball(double x, double y) {
        this.x = x;
        this.y = y;
    }


    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void move(double x1, double y1) {
        while (x1 > x || y1 > y) {
            if (x1 > x) {
                x++;
            }
            if (y1 > y) {
                y++;
            }
            System.out.println("x: " + x + " y: " + y);
        }
        System.out.println("Final position: " + x + " " + y);
    }

    @Override
    public String toString() {
        return "Balls coordinates: " + x + " " + y;
    }
}
