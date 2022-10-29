package ru.mirea.practice2.s21k0647;


import java.util.Scanner;

public class TestBall {
    public static void main(String[] args) {

        Ball b1 = new Ball(0, 0);
        System.out.println(b1.toString());
        Scanner source = new Scanner(System.in);
        System.out.print("Ball x and y: ");
        b1.setX(source.nextDouble());
        b1.setY(source.nextDouble());
        System.out.println(b1.toString());
        System.out.print("Ball move x and y : ");
        b1.move(source.nextDouble(), source.nextDouble());
        System.out.print("Ball move x and y : ");
        System.out.print(b1.toString());
    }
}
