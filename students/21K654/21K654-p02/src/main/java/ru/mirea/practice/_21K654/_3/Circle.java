package ru.mirea.practice._21K654._3;

public class Circle {
    private Point center;
    private double radius;
    public Circle(double x, double y){
        this.center=new Point(x,y);
    }
    public Circle(double x, double y,double r){
        this.center=new Point(x,y);
        this.radius=r;
    }
    public Circle(){
        this.center=new Point();
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    @Override
    public String toString(){
        return center.toString()+" "+this.radius;
    }
}
