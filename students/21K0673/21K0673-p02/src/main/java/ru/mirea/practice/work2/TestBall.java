package ru.mirea.practice.work2;

abstract class TestBall {
    public static void main(String[] args) {
        Ball a = new Ball(34, 56);

        System.out.println(a);
        System.out.println(a.getX());
        System.out.println(a.getY());
        a.setX(45);
        a.setY(24);
        a.setXY(45, 424);
        a.move(23, 546);
    }
}
