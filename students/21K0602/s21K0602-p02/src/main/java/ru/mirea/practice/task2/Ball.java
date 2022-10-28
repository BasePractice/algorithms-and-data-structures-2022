package ru.mirea.practice.task2;

import static java.lang.Math.abs;

public class Ball {
    private double x;
    private double y;
    {
        x=0.0;
        y=0.0;
    }
    public Ball(double x, double y){
        this.x=x;
        this.y=y;
    }
    public Ball(){

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

    public void setXY(double x,double y){
        this.x=x;
        this.y=y;
    }
    public void move(double xDisp, double yDisp){
        while(x!=xDisp || y!=yDisp){
            if(x>xDisp){
                x--;
            }
            else if (x<xDisp){
                x++;
            }

            if(y>yDisp){
                y--;
            }
            else if(y<yDisp){
                y++;
            }

            if(abs(x-xDisp)<1 ){
                if(x>xDisp){
                    x-=abs(x-xDisp);
                }
                else{
                    x+=abs(x-xDisp);
                }

            }
            if(abs(y-yDisp)<1 ){
                if(y>yDisp){
                    y-=abs(y-yDisp);
                }
                else{
                    y+=abs(y-yDisp);
                }

            }


            System.out.println("x= "+x+ " y="+y+" to xDip= "+xDisp+" to yDip= "+yDisp);
        }
    }

    @Override
    public String toString() {
        return "Ball{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
