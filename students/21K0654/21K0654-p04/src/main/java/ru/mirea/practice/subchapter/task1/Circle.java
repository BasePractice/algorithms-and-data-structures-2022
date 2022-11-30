package ru.mirea.practice.subchapter.task1;

public class Circle extends Shape {
    protected double r;
    Circle(){}
    public Circle(double r,String color, boolean b){
        super(color,b);
        this.r=r;
    }
    public Circle(double r) {
        super();
        this.r=r;
    }
    public double getR(){return r;}
    public  void setR(double r){this.r=r;}
    double getArea(){
        return 3.14*Math.pow(r,2);
    }
    public double getPerimeter(){
        return 2*3.14*r;
    }
    public String toString(){
        return "Radius: "+r+super.toString();
    }
}
