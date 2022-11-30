package ru.mirea.practice.subchapter.task1;

import java.util.Scanner;

public class Test {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        Circle c = new Circle(10,"blue",true);
        Rectangle r =new Rectangle( 3.5,6.2,"green",false);
        Square s =new Square(5,"black",true);
        System.out.println(c.getArea()+" "+c.getPerimeter()+" "+c.toString());
        System.out.println(r.getArea()+" "+r.getPerimeter()+" "+r.toString());
        System.out.println(s.getArea()+" "+s.getPerimeter()+" "+s.toString());
        Movable_Circle mp=new Movable_Circle(6,0,0,5,8);
        mp.moveDown();
        System.out.println(mp.toString());
        mp.moveLeft();
        System.out.println(mp.toString());
    }
}
