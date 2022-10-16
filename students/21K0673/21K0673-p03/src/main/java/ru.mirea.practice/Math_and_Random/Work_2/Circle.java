package ru.mirea.practice.Math_and_Random.Work_2;

public class Circle {
    private Point Center;
    private double R;

    Circle(Point Center, double R)
    {
        this.Center = Center;
        this.R = R;
    }

    Circle(){}

    public double getR()
    {
        return this.R;
    }

    public Point getCenter()
    {
        return this.Center;
    }

    public void setR(double R)
    {
        this.R=R;
    }

    public void setCenter(Point Center)
    {
        this.Center=Center;
    }

    public void setALL(Point Center,double R)
    {
        this.Center=Center;
        this.R=R;
    }

    public String toString()
    {
        return "{"+ "Радиус = "+R+", Координаты центра окружности: "+Center+"}";
    }
}
