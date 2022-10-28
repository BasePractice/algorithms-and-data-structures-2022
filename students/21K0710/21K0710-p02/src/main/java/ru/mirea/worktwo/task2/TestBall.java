package ru.mirea.worktwo.task2;

public final class TestBall {
    private TestBall() {
    }

    public static void main(String[] args) {
        Ball a = new Ball(1.0, 4.2);
        System.out.println(a.getX());
        System.out.println(a.getY());
        a.setXY(0.0, 0.0);
        System.out.println(a.getX());
        System.out.println(a.getY());
        a.move(3.5, -5.1);
        System.out.println(a.getX());
        System.out.println(a.getY());
    }
}
