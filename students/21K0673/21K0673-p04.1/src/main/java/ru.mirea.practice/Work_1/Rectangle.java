package ru.mirea.practice.Work_1;

public class Rectangle extends Shape{
    private double a;
    private double b;

    Rectangle(){}
    Rectangle(double a, double b){
        this.a=a;
        this.b=b;
    }

    public String getType(){
        return "Rectangle";
    }
    public double getArea(){
        return a*b;
    }
    public double getPerimeter(){
        return 2*a+2*b;
    }
    public String toString() {
        return "Rectangle:{Side a = "+a+"Side b = "+b+", Area = "+(a*b)+", Perimeter = "+(2*a+2*b)+"}";
    }
}
