package ru.mirea.practice.ex2;

class BallTest {
    public static void main(String[] args) {
        double x2 = 3.14;
        double y2 = 54.44;
        Ball ball1 = new Ball();
        Ball ball2 = new Ball(x2,y2);

        System.out.println("ball1 x: " + ball1.getX());
        System.out.println("ball2 x: " + ball2.getX());

        ball1.setX(342.2343);
        System.out.println("ball1 new x: " + ball1.getX());

        System.out.println("ball1 y: " + ball1.getY());
        System.out.println("ball2 y: " + ball2.getY());

        ball1.setX(835.7221);
        System.out.println("ball1 new y: " + ball1.getY());

        ball1.setXY(83422242.21, 421224.95);
        System.out.println("ball1 new x: " + ball1.getX());
        System.out.println("ball1 new y: " + ball1.getY());

        ball1.move(834245452.2452 - ball1.getX(),43434234.95 - ball1.getY());
        System.out.println("ball1 new x: " + ball1.getX());
        System.out.println("ball1 new y: " + ball1.getY());

        System.out.println("ball1 string: " + ball1.toString());
    }
}