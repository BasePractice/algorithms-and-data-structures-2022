package ru.mirea.practice.Work_6;

public class Circle {
    private Point Center;
    private double R;

    Circle(Point Center, double R)
    {
        this.Center = Center;
        this.R = R;
    }

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

    public void setXY(Point Center,double R)
    {
        this.Center=Center;
        this.R=R;
    }

    public double getArea()
    {
        return this.R*this.R*3.14;
    }

    public double getLength()
    {
        return this.R*2*3.14;
    }

    public void getComparison(Circle a,Circle b)
    {
        if(a.getArea()>b.getArea()){
            System.out.println("Площадь первой окружности больше");
        }else if(a.getArea()==b.getArea()){
            System.out.println("Площади окружностей равна");
        }else if(a.getArea()<b.getArea()){
            System.out.println("Площадь второй окружности больше");
        }
        if(a.getLength()>b.getLength()){
            System.out.println("Длина первой окружности больше");
        }else if(a.getLength()==b.getLength()){
            System.out.println("Длины окружностей равна");
        }else if(a.getLength()<b.getLength()){
            System.out.println("Длина второй окружности больше");
        }
    }

    public String toString()
    {
        return "{"+ "Радиус = "+R+", Координаты центра окружности: "+Center+"}";
    }
}
