package ru.mirea.practice.task6;

import java.util.Objects;

public class Circle implements Comparable<Circle> {
    private double s;
    private double length;
    private double radius;

    public Circle() {
        setRadius(0);
    }

    public Circle(double radius) {

        setRadius(radius);
    }

    public double getS() {
        return s;
    }

    public double getLength() {
        return length;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius < 0){radius = Math.abs(radius);}
        this.radius = radius;
        s = Math.PI * Math.pow(this.radius, 2);
        length = 2 * Math.PI * this.radius;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o){return true;}
        if(o == null || getClass() != o.getClass()){return false;}
        Circle circle = (Circle) o;
        return radius == circle.radius;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }

    @Override
    public int compareTo(Circle o) {
        return Double.compare(o.radius, this.radius);
    }
}
