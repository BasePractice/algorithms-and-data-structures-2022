package Practice2;

import java.util.Scanner;

class TestBall {
    public static void main (String[] args) {
        Scanner putin = new Scanner (System.in);
        double x, y;
        System.out.println("Введите координаты мяча \nx = ");
        Ball Bal = new Ball();
        x = putin.nextDouble();
        Bal.setX(x);
        System.out.println("y = ");
        y = putin.nextDouble();
        Bal.setY(y);
        System.out.println("Текущее положение мяча: " + Bal);
        System.out.println("Куда вы хотите сдвинуть мяч?\nПо x на ");
        x = putin.nextDouble();
        System.out.println("По y на ");
        y = putin.nextDouble();
        Bal.move(x, y);
        System.out.println("Новое положение мяча: " + Bal);
    }
}

class Ball {

    private double x = 0.0;
    private double y = 0.0;

    public Ball(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Ball() {}

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setXY (double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void move(double DispX, double DispY) {
        this.x = x + DispX;
        this.y = y + DispY;
    }
    @Override
    public String toString() {
        return "x = " + x +
                ", y = " + y;
    }
}
