package ru.mirea.practice22.s21k0706;

//import java.lang.*;

public final class TestBall {
    private TestBall() {

    }

    public static void main(String[] args) {
        //double r;
        Ball k1 = new Ball(3.1, 4);
        System.out.println(k1.toString());
        Ball pr = new Ball();
        System.out.println(pr.toString());
        k1.move(5,9);
        System.out.println(k1.toString());
        k1.setXY(2,3);
        System.out.println(k1.toString());
    }
}
