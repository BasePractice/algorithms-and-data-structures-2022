package ru.mirea.practice._21K654._2;

public class TestBall {
    public static void main(String[] args) {
        Ball ball0=new Ball();
        Ball ball1=new Ball(1.4,0.5);
        Ball ball2=new Ball();
        System.out.println(ball0.toString()+'\n'+ball1.toString()+'\n'+ball0.getX()+ ball0.getY());
        ball0.setXY(0.7,4.1);
        ball1.move(1,4);
        ball2.setY(30);
        System.out.println(ball0.toString()+'\n'+ball1.toString()+'\n'+ball2.toString());
        ball2.setX(30);
        System.out.println(ball2.toString());
    }
}
